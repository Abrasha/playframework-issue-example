package util

import akka.stream.Materializer
import play.api.test.Injecting

/**
  * Contains [[Materializer]] from application context
  */
trait GuiceMaterializer {
  this: Injecting =>

  implicit def materializer: Materializer = inject[Materializer]

}
