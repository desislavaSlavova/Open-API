package product.simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import utils._


/**
 * Created by os-desislava.slavova on 24/09/2015.
 */
object Actions {

  val headers=Headers.sentHeaders
  //val updateProductFile =
  val merchantAuthenticationKeyFeeder = csv("bla.csv").circular

  def updateProduct():ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Update Product")
      .post("/product/update")
      //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))//not sure that I must send Params
       .headers(headers)
      .body(ELFileBody("data/json.bodies/test.update.product.sku")).asJSON
      .check(status.is(200)))
  }

  def addProduct() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Add a Product")
    .post("/product/add")
      //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
    .body(ELFileBody("path to the feeder file")).asJSON
    .check(status.is(200)))
  }

  def addProductVariants() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Add Product Variants")
    .post("/product/addVariants")
    //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
    .body(ELFileBody("path to the feeder file")).asJSON
    .check(status.is(200)))

  }

  def deleteProduct() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Delete a Product")
    .post("/product/delete")
    //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
    .body(ELFileBody("path to the feeder file")).asJSON
    .check(status.is(200)))
  }

  def deleteProductImage() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Delete a Product Image")
    .post("/product/deleteImage")
    //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
    .body(ELFileBody("path to the feeder file")).asJSON
    .check(status.is(200)))

  }

  def deleteProductShopCategories() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Delete Product Shop Categories")
    .post("/product/deleteShopCategories")
   // .formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
    .body(ELFileBody("path to the feeder file")).asJSON
    .check(status.is(200)))
  }

  def deleteProductVariants() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Delete Product Variants")
    .post("/product/deleteVariants")
      //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
      .body(ELFileBody("path to the feeder file")).asJSON
      .check(status.is(200)))
  }

  def getProduct() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Get a Product")
    .get("/product/get")
    )
  }

  def getProductCategories() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Get Product Categories")
    .post("/product/getCategories")
      //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
      .body(ELFileBody("path to the feeder file")).asJSON
      .check(status.is(200)))
  }

  def setProductDescWithImages() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Set Product Description with Images")
    .post("/product/setDescWithImages")
      //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
      .body(ELFileBody("path to the feeder file")).asJSON
      .check(status.is(200)))
  }


 def setproductImages() : ChainBuilder = {
   feed(merchantAuthenticationKeyFeeder)
   exec(http("Set Product Images")
   .post("/product/setImage")
     //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
     .headers(headers)
     .body(ELFileBody("path to the feeder file")).asJSON
     .check(status.is(200)))
 }

  def setProductShopCategories() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Set product Shop Categories")
    .post("/product/setShopCategories")
      //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
      .body(ELFileBody("path to the feeder file")).asJSON
      .check(status.is(200)))
  }

  def updateProductVariants() : ChainBuilder = {
    feed(merchantAuthenticationKeyFeeder)
    exec(http("Update product Variants")
    .post("/product/updateVariants")
      //.formParamSeq(Seq(("merchantId", "merchantId"), ("product", "product")))
      .headers(headers)
      .body(ELFileBody("path to the feeder file")).asJSON
      .check(status.is(200)))
  }






}
