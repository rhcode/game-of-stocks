package com.rhcode.gameofstocks.core

import com.google.inject.AbstractModule

/**
  * Created by rhonwade on 3/21/16.
  */
class Module extends AbstractModule {
    def configure() = {
        bind(classOf[MarketDataAPI]).to(classOf[Markit])
    }
}
