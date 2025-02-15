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
class ForSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "forSpec" should {

    "for with generator" in {

      val servesAsGenerator = List(1,2,3)

      val res = for(i <- servesAsGenerator) yield (i*i)
      println(res)


      val res2 = for(i <- servesAsGenerator){
        i*i
      }
      println(res2) //unit
    }
  }

}
