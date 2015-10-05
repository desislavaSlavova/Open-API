package product.simulations

import io.gatling.core.Predef._
import utils._

/**
 * Created by os-desislava.slavova on 25/09/2015.
 */
class addProductSimulation extends Simulation{
  val config = new Configurations

  val scn = scenario("Add Product").exec(Actions.addProduct())

  setUp(scn.inject().protocols(config.getHttpConf))

}
