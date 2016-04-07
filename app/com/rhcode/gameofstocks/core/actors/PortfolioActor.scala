package com.rhcode.gameofstocks.core.actors

import akka.actor.Actor
import com.rhcode.gameofstocks.core.actors.PortfolioActor.{GetStocks, SellStock, BuyStock}
import play.api.Logger

/**
  * Created by rhonwade on 3/21/16.
  */
object PortfolioActor {
    case class BuyStock(userId: Long, symbol: String)
    case class SellStock(userId: Long, symbol: String)
    case class GetStocks(userId: Long)
}

class PortfolioActor extends Actor {
    def receive = {
        case BuyStock => println("addStock()")
        case SellStock => Logger.debug("sellStock()")
        case GetStocks => println("getStocks()")
        case _ => Logger.debug("unknownMessage")
    }


}
