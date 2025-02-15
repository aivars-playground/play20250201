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
class PartialFunctions extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "PartialFunctions" should {

    "use subset of values" in {

      val oneEigth = new PartialFunction[Int, Int] {
        override def isDefinedAt(x: Int): Boolean = x != 0
        override def apply(v1: Int): Int = 8 / v1
      }

      println("defined at 1" + oneEigth.isDefinedAt(1))


      val eigthOf200: AnyVal = if(oneEigth.isDefinedAt(200)) oneEigth.apply(200) else -1
      println("process if defined at 200 then process ->  " + eigthOf200)


      val eigthOf0: AnyVal = if (oneEigth.isDefinedAt(0)) oneEigth.apply(0) else -1
      println("process if defined at 0 then process ->  " + eigthOf0)

      val ignoring = oneEigth.apply(0)
      println("process ignoring 0  ->  " + ignoring)  //div by zero.. ignoring isDefinedAt....

    }
  }

}
