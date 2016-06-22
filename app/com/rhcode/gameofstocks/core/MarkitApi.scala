package com.rhcode.gameofstocks.core

import com.google.inject.Inject
import play.api.libs.json.JsDefined
import play.api.libs.ws.{WSResponse, WSClient}

/**
  * Created by rhonwade on 3/21/16.
  */
class MarkitApi @Inject() (ws: WSClient) extends MarketDataApi {
    import scala.concurrent.ExecutionContext.Implicits.global

    override def getQuote(symbol: String): String = {
        val request = ws.url("http://dev.markitondemand.com/MODApis/Api/v2/Quote/json?symbol=" + symbol)
        val resp = request.get().map {
           response => println(response.json \ "LastPrice" match {case JsDefined(v) => println(v.toString)})
        }
        "asfd"
    }
}
