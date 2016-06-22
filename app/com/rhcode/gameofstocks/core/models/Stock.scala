package com.rhcode.gameofstocks.core.models

import play.api.libs.json.Json

/**
  * Created by rhonwade on 3/19/16.
  */
case class Stock (symbol: String,
                 buyDate: Long,
                 buyPrice: Float,
                 currentPrice: Float,
                 gain: Float,
                 gainPercent: Float)

object Stock {
    implicit val formatter = Json.format[Stock]
}