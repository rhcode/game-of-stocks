package controllers

import play.api.mvc._

object Application extends Controller {
    // Return created userid
    def newUser = Action {
        Ok("1234")
    }

    // Return user details for given userid
    def getUser(userId: Long) = Action {
        Ok("3wrefflk")
    }

    // Return price at which stock was bought
    def addStock(userId: Long, symbol: String) = Action {
        Ok(userId.toString+symbol)
    }

    // Return portfolio
    def getStocks(userId: Long) = Action {
        Ok("3sf")
    }
}