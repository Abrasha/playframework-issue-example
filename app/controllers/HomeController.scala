package controllers

import javax.inject._

import play.api.libs.json.{Format, JsError, JsSuccess, Json}
import play.api.mvc._

import scala.concurrent.Future

case class Person(name: String, age: Int)

object Person {
  implicit val personFormat: Format[Person] = Json.format[Person]
}

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def accept = Action.async(parse.json) { req =>
    req.body.validate[Person] match {

      case JsSuccess(person, _) => Future.successful(Created(Json.toJson(person)))
      case JsError(errors) => Future.successful(BadRequest(JsError.toJson(errors)))

    }
  }

}
