package product.simulations

import io.gatling.core.Predef._
import utils._


/**
 * Created by os-desislava.slavova on 25/09/2015.
 */
class getProductSimulation extends Simulation{
val config = new Configurations

  val scn = scenario("Get a Product").exec(Actions.getProduct())

  setUp(scn.inject().protocols(config.getHttpConf))
}
