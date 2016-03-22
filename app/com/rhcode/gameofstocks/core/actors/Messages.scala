package com.rhcode.gameofstocks.core.actors

/**
  * Created by rhonwade on 3/21/16.
  */
sealed trait Messages

// BrokerActor
case class GetQuote(symbol: String) extends Messages

// PortfolioActor
case class BuyStock(userId: Long, symbol: String) extends Messages
case class SellStock(userId: Long, symbol: String) extends Messages
case class GetStocks(userId: Long) extends Messages

// UserActor
case class GetUser(userId: Long) extends Messages
case class NewUser(userId: Long) extends Messages