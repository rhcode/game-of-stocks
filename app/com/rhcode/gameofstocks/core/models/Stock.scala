package com.rhcode.gameofstocks.core.models

/**
  * Created by rhonwade on 3/19/16.
  */
case class Stock (symbol: String,
                 buyDate: Long,
                 buyPrice: Float,
                 currentPrice: Float,
                 gain: Float,
                 gainPercent: Float)
