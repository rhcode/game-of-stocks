import com.google.inject.AbstractModule
import com.rhcode.gameofstocks.core.{MarketDataApi, MarkitApi}

/**
  * Created by rhonwade on 3/21/16.
  */
class Module extends AbstractModule {
    def configure() = {
        bind(classOf[MarketDataApi]).to(classOf[MarkitApi])
    }
}
