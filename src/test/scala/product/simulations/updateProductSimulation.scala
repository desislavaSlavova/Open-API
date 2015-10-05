package product.simulations

/**
 * Created by os-desislava.slavova on 10/09/2015.
 */
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import utils.Configurations
import scala.concurrent.duration._





  class updateProductSimulation extends Simulation{
    val config = new Configurations
    val scn = scenario("Update Product").exec(Actions.updateProduct())

    setUp(scn.inject(constantUsersPerSec(10) during(5 seconds))).protocols(config.getHttpConf)


  }


