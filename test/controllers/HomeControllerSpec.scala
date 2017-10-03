package controllers

import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.libs.json.Json
import play.api.test.Helpers._
import play.api.test.{FakeRequest, Injecting}
import util.GuiceMaterializer

class HomeControllerSpec
  extends PlaySpec
    with GuiceOneAppPerSuite
    with GuiceMaterializer
    with Injecting {

  val person = Person("James", 20)

  "HomeController" should {

    "return CREATED HTTP status" in {
      val homeController = inject[HomeController]

      val request = FakeRequest()
        .withJsonBody(Json.toJson(person))
        .withHeaders(CONTENT_TYPE -> JSON)

      val response = homeController.accept.apply(request)

      assert(status(response) === CREATED)

    }

    "return valid person in response" in {
      val homeController = inject[HomeController]

      val request = FakeRequest()
        .withJsonBody(Json.toJson(person))
        .withHeaders(CONTENT_TYPE -> JSON)

      val response = homeController.accept.apply(request)

      val body = contentAsJson(response).validate[Person]

      assert(body.isSuccess)
      assert(body.get === person)
    }

  }

}
