package com.rhcode.gameofstocks.core.actors

import akka.actor.Actor
import com.rhcode.gameofstocks.core.models.Stock
import play.api.Logger

/**
  * Contains all the code associated with interacting with the Quandl API
  * Created by rhonwade on 3/21/16.
  */
class BrokerActor extends Actor {
    val stockStore: Map[String, Stock] = Map()

    //def calculateCurrentValue

    def receive = {
        case GetQuote => println("getQuote()")
        case _ => Logger.debug("unknownMessage")
    }

}
