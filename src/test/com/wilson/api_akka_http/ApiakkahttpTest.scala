package com.wilson.api_akka_http

import org.scalatest.GivenWhenThen
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

final class ApiakkahttpTest extends AnyFunSpec with GivenWhenThen {
  describe("Apiakkahttp"){
    it("should greet") {
      Given("a Apiakkahttp")

      val apiakkahttp = new Apiakkahttp

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = apiakkahttp.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
