package controllers

import org.scalatestplus.play.*
import org.scalatestplus.play.guice.*
import play.api.test.*

import scala.annotation.tailrec

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class CollectionSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "CollectionSpec" should {

    "pattern matching" in {
      val names = List("A","B","C","D","E")
      names match {
        case List("A",_) => println("---found A")      //found b, this line alone has would produce a match err
        case List(_,"B",_,_,_) => println("---found B")
      }

      names match
        case List(_,_,"C",x:String,_*) => println("next to C is:" +x)
        case _ => println("-----------nope")

      def concat(list: List[String]): String = {
        if (list.isEmpty) ""
        else list.head + concat(list.tail)
      }
      println("--concat:"+concat(names))

      @tailrec
      def findItemFollowing(target: String, list: List[String]): Option[String] = {
        if (list.tail.isEmpty) None
        else if (list.head == target) list.tail.headOption
        else findItemFollowing(target, list.tail)
      }

      println("--next to C is:"+findItemFollowing("C",names).getOrElse("NOTHING"))
      println("--next to E is:" + findItemFollowing("E", names).getOrElse("NOTHING"))


    }


  }

}
