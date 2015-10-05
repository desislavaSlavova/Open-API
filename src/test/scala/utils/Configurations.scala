package utils

import io.gatling.http.Predef._
import io.gatling.http.config.HttpProtocolBuilder

/**
 * Created by os-desislava.slavova on 24/09/2015.
 */
class Configurations {
  var environment = getParam("env", "local")
  var subDomain = getParam("subDomain", "")
  var baseDomain = getParam("baseDomain", "localhost")

  var t_users = 1
  var t_ramp = 1
  var hostname =""

  def httpsUrl = {
    "https://" + hostname
  }
  def getHttpConf: HttpProtocolBuilder = {

    if (environment == "production") {
      http.baseURL(httpsUrl).shareConnections
    }  else {

      http.baseURL(httpsUrl)
    }
  }
  def getParam(key: String, default: String): String = {
    Option(System.getProperty(key)).getOrElse(default.toString)
  }
  def getNumUsers: Int = {
    t_users = getParam("users", "1").toInt
    t_users
  }

  def getDurinSeconds: Int = {
    getParam("seconds", "10").toInt
  }
}
