package product.simulations

import io.gatling.core.Predef._
import utils.Configurations

/**
 * Created by os-desislava.slavova on 25/09/2015.
 */
class deleteProductShopCategoriesSimulation extends Simulation{
val config= new Configurations
val scn = scenario("Delete Product Shop Categories").exec(Actions.deleteProductShopCategories())

  setUp(scn.inject().protocols(config.getHttpConf))
}
