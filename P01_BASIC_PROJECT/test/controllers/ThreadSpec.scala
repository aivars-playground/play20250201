package controllers

import org.scalatestplus.play.*
import org.scalatestplus.play.guice.*
import play.api.test.*
import play.api.test.Helpers.*

import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.{ExecutorService, Executors}
import scala.concurrent.{ExecutionContext, ExecutionContextExecutor, Future}

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class ThreadSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "ThreadSpec" should {

    "render the index page from a new instance of controller" in {

      given executonContext: ExecutionContext = ExecutionContext.global
      //given executonContext: ExecutionContext = ExecutionContext.fromExecutorService(Executors.newVirtualThreadPerTaskExecutor())

      println("--th1:"+Thread.currentThread.getName)
      val future:Future[String] = Future({
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName  + Thread.currentThread().isDaemon + " vt:" + Thread.currentThread().isVirtual)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        Thread.sleep(2000)
        println("--------------:"+Thread.currentThread + "  id:"+Thread.currentThread.getName)
        "AAA"
      })

      val ai:AtomicInteger = new AtomicInteger()
      1 to 1_000_000 foreach { i =>
        Future({
          //println("-in-th_" + i + ": " + Thread.currentThread.getName + "  daemon:" + Thread.currentThread().isDaemon + " vt:" + Thread.currentThread().isVirtual)
          Thread.sleep(1000)
          Thread.sleep(1000)
          Thread.sleep(1000)
          Thread.sleep(1000)
          Thread.sleep(1000)
          Thread.sleep(1000)
          //println("-out-th_"+i+ ": " + Thread.currentThread.getName + "  daemon:" + Thread.currentThread().isDaemon + " vt:" + Thread.currentThread().isVirtual)
          ai.incrementAndGet()
        })
      }

      while (!future.isCompleted) {}
      println("--th3:"+Thread.currentThread.getName +" res:"+future.value)


      Thread.sleep(100000)

      println("--COMPLETED:" + ai.get() )


    }
  }
}
