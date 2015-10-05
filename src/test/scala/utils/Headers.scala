package utils

import io.gatling.core.Predef._

/**
 * Created by os-desislava.slavova on 24/09/2015.
 */
object Headers {
 // val authenticationName = "ESA"
  //val authenticationKey="cTB2YXdoY3lDNzE2aFRscTpPa1R5bFJKc215YXAyZTRX"
  //val merchantId =  "string"
  //val product = "product"
  val merchantIdFeeder = csv("bla.csv").circular

  val sentHeaders = Map(
    "Content-Type" -> "application/json",
    "Charset"-> "UTF-8",
 "Authorization" -> "ESA ${merchanAutenticationId}")

}
