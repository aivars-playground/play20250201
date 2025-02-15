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
class PlaceholdersSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "PlaceholdersSpec" should {

    "use a placeholder" in {

      //this is a method
      def aaa(in:String): String = in.reverse

      //this is a named function
      val bbb:(String => String) = (in) => in.reverse

      //this uses placeholders
      val sum = (_:Int) + (_:Int)
      println(sum(1,2))


    }

  }

}
