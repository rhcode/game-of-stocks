package controllers

import akka.actor.{Props, ActorSystem}
import com.google.inject.{Inject, Singleton}
import com.rhcode.gameofstocks.core.MarketDataApi
import com.rhcode.gameofstocks.core.actors.BrokerActor
import com.rhcode.gameofstocks.core.actors.BrokerActor.GetQuote
import play.api.mvc._

@Singleton
class Application @Inject()(system: ActorSystem, marketApi : MarketDataApi) extends Controller {
    val brokerActor = system.actorOf(Props(new BrokerActor(marketApi)), "BrokerActor")
    brokerActor ! GetQuote("AAPL")

    // Return created userid
    def newUser = Action {
        Ok("1234")
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