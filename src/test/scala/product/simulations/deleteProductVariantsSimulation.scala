package product.simulations

import io.gatling.core.Predef._
import utils._

/**
 * Created by os-desislava.slavova on 25/09/2015.
 */
class deleteProductVariantsSimulation extends Simulation{

  val config = new Configurations

  val scn=scenario("Delete Product Variants").exec(Actions.deleteProductVariants())

  setUp(scn.inject().protocols(config.getHttpConf))
}
