package com.rhcode.gameofstocks.core.actors

import akka.actor.Actor
import play.api.Logger

/**
  * Created by rhonwade on 3/21/16.
  */
class PortfolioActor extends Actor {
    def receive = {
        case BuyStock => println("addStock()")
        case SellStock => Logger.debug("sellStock()")
        case GetStocks => println("getStocks()")
        case _ => Logger.debug("unknownMessage")
    }


}
