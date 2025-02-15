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
class XmlSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "XmlSpec" should {

    "xml and json literals" in {

      //supported but will be dropped
      val xmlLiteral =
        <abc>
          <firstName>aaa</firstName>
        </abc>
      println("--xmlLiteral:"+xmlLiteral)

    }
  }
}
