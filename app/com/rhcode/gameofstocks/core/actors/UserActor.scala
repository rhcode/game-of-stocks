package com.rhcode.gameofstocks.core.actors

import akka.actor.Actor
import com.rhcode.gameofstocks.core.actors.UserActor.{GetUser, NewUser}
import com.rhcode.gameofstocks.core.models.User
import play.api.Logger
/**
  * Created by rhonwade on 3/21/16.
  */
object UserActor {
    case class GetUser(userId: Long)
    case class NewUser(user : User)
}

class UserActor extends Actor {
    def receive = {
        case GetUser(userId) => Logger.debug("getUser()")
        case NewUser(user : User) =>
            Logger.debug("Creating new user with name : " + user.name)

        case _ => Logger.debug("unknownMessage")
    }
}
