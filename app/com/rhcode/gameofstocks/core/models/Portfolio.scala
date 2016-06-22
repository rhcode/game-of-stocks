package com.rhcode.gameofstocks.core.models

import play.api.libs.json.Json

/**
  * Created by rhonwade on 3/21/16.
  */
case class Portfolio (stocks : List[Stock])

object Portfolio {
    implicit val formatter = Json.format[Portfolio]
}
