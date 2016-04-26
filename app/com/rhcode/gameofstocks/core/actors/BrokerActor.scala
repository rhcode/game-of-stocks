package com.rhcode.gameofstocks.core.actors

import akka.actor.Actor
import com.google.inject.Inject
import com.rhcode.gameofstocks.core.MarketDataApi
import com.rhcode.gameofstocks.core.actors.BrokerActor.GetQuote
import com.rhcode.gameofstocks.core.models.Stock
import play.api.Logger

/**
  * Contains all the code associated with interacting with the Quandl API
  * Created by rhonwade on 3/21/16.
  */
object BrokerActor {
    case class GetQuote(symbol: String)
}

class BrokerActor (marketAPI : MarketDataApi) extends Actor {
    val stockStore: Map[String, Stock] = Map()
    //def calculateCurrentValue

    def receive = {
        case GetQuote(symbol) => {
            Logger.info("Quantopian")
            println(marketAPI.getQuote(symbol))
            Logger.info(marketAPI.getQuote(symbol))
        }
        case _ => Logger.debug("unknownMessage")
    }
}
