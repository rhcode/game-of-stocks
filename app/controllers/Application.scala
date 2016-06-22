package controllers

import akka.actor.{ActorSystem, Props}
import com.google.inject.{Inject, Singleton}
import com.rhcode.gameofstocks.core.MarketDataApi
import com.rhcode.gameofstocks.core.actors.BrokerActor
import com.rhcode.gameofstocks.core.models.User
import play.api.libs.json.{JsError, JsSuccess, Json}
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoComponents, ReactiveMongoApi}
import reactivemongo.play.json.collection.JSONCollection

import scala.concurrent.Future

@Singleton
class Application @Inject()(system: ActorSystem, marketApi : MarketDataApi, val reactiveMongoApi: ReactiveMongoApi)
    extends Controller with MongoController with ReactiveMongoComponents {
    val brokerActor = system.actorOf(Props(new BrokerActor(marketApi)), "BrokerActor")

    def usersFuture : Future[JSONCollection] = database.map(_.collection[JSONCollection]("users"))

    // Create a new user
    def newUser = Action.async(parse.json)  { request =>
        Json.fromJson[User](request.body) match {
            case JsSuccess(user, _) =>
                for {
                    users <- usersFuture
                    lastError <- users.insert(user)
                } yield {
                    Created("Created 1 user")
                }

            case JsError(errors) =>
                Future.successful(BadRequest("Could not build a city from the json provided. "))
        }
    }

    // Return user details for given userid
    def getUser(userId: Long) = Action {
        Ok("3wrefflk")
    }

    // Return price at which stock was bought
    def addStock(userId: Long, symbol: String) = Action {
        Ok(userId.toString+symbol)
    }

    // Return portfolio
    def getStocks(userId: Long) = Action {
        Ok("3sf")
    }
}