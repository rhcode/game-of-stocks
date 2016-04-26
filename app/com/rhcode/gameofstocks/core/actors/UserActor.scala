package com.rhcode.gameofstocks.core.actors

import akka.actor.Actor
import com.rhcode.gameofstocks.core.actors.UserActor.{NewUser, GetUser}
import play.api.Logger

/**
  * Created by rhonwade on 3/21/16.
  */
object UserActor {
    case class GetUser(userId: Long)
    case class NewUser(userId: Long)
}

class UserActor extends Actor {
    def receive = {
        case GetUser(userId) => Logger.debug("getUser()")
        case NewUser(userId) => Logger.debug("newUser()")
        case _ => Logger.debug("unknownMessage")
    }
}
