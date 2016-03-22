package com.rhcode.gameofstocks.core.actors

import akka.actor.Actor
import play.api.Logger

/**
  * Created by rhonwade on 3/21/16.
  */
class UserActor extends Actor {
    def receive = {
        case GetUser => Logger.debug("getUser()")
        case NewUser => Logger.debug("newUser()")
        case _ => Logger.debug("unknownMessage")
    }
}
