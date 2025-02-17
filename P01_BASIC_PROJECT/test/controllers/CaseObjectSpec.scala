package controllers

import org.scalatestplus.play.*
import org.scalatestplus.play.guice.*
import play.api.test.*

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class CaseObjectSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  sealed trait Named {
    val name: String
  }

  case class AAAA(name: String) extends Named

  case object DefaultMessage extends Named {
    val name = "A121"
    val content = "Hello everyone..!!"
  }

  "CaseObjectSpec" should {

    "for with generator" in {
      println(DefaultMessage)
      println(2::1::Nil)
    }
  }

}
