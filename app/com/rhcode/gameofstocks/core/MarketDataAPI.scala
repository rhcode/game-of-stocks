package com.rhcode.gameofstocks.core

/**
  * Created by rhonwade on 3/21/16.
  */
abstract class MarketDataAPI {
    def getQuote(symbol: String): String
}
