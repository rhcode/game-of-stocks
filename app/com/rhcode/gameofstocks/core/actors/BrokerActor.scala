package com.rhcode.gameofstocks.core.actors

import akka.actor.{Cancellable, Actor}
import com.google.inject.Inject
import com.rhcode.gameofstocks.core.MarketDataApi
import com.rhcode.gameofstocks.core.actors.BrokerActor.{RefreshData, GetQuote}
import com.rhcode.gameofstocks.core.models.Stock
import play.api.Logger

/**
  * Contains all the code associated with interacting with the Quandl API
  * Created by rhonwade on 3/21/16.
  */
object BrokerActor {
    case class GetQuote(symbol: String)
    case object RefreshData
}

class BrokerActor (marketAPI : MarketDataApi) extends Actor {
    def receive = {
        case GetQuote(symbol) =>
            Logger.info(marketAPI.getQuote(symbol))

        case _ => Logger.debug("unknownMessage")
    }
}
