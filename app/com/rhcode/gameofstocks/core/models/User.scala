package com.rhcode.gameofstocks.core.models

import play.api.libs.json.Json

/**
  * Created by rhonwade on 3/21/16.
  */
case class User(name : String,
                address : String,
                portfolio : Portfolio)

object User {
    implicit val formatter = Json.format[User]
}