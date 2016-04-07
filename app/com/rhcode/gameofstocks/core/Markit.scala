package com.rhcode.gameofstocks.core

import scala.io.Source._
/**
  * Created by rhonwade on 3/21/16.
  */
class Markit extends MarketDataAPI {
    override def getQuote(symbol: String): String = {
        val url = "http://dev.markitondemand.com/MODApis/Api/v2/Quote/json?symbol="
        fromURL(url + symbol).mkString
    }
}
