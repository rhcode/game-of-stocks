package com.rhcode.gameofstocks.dao

import reactivemongo.api.MongoDriver

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by rhonwade on 5/16/16.
  */
object MongoDao {
    val driver = new MongoDriver
    val connection = driver.connection(List("localhost"))
    val db = connection.database("mongodb")

}
