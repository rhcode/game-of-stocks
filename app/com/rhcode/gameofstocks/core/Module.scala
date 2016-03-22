package com.rhcode.gameofstocks.core

import com.google.inject.AbstractModule
import com.rhcode.gameofstocks.core.actors.BrokerActor
import com.sun.corba.se.pept.broker.Broker

/**
  * Created by rhonwade on 3/21/16.
  */
class Module extends AbstractModule {
    def configure() = {
        bind(classOf[MarketDataAPI]).to(classOf[Quandl])
    }
}
