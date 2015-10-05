package product.simulations

import io.gatling.core.Predef._
import utils.Configurations

/**
 * Created by os-desislava.slavova on 25/09/2015.
 */
class updateProductVariantsSimulation extends Simulation{
 val config = new Configurations

  val scn = scenario("Update Product Variants").exec(Actions.updateProductVariants())

  setUp(scn.inject().protocols(config.getHttpConf))
}
