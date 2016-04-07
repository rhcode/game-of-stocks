package com.rhcode.gameofstocks.core

/**
  * Created by rhonwade on 3/21/16.
  */
trait MarketDataAPI {
    def getQuote(symbol: String): String
}
