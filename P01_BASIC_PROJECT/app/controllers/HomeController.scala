package controllers

import play.api.*
import play.api.mvc.*

import java.util.concurrent.{ExecutorService, Executors}
import javax.inject.*
import scala.collection.parallel.CollectionConverters.*
import scala.collection.parallel.{ExecutionContextTaskSupport, ForkJoinTaskSupport}
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Random


@Singleton
class HomeController @Inject()(
  val controllerComponents: ControllerComponents,
) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>

    val list = (1 to 10000).toList.par

    val tasksupport = ExecutionContextTaskSupport(
      ExecutionContext.fromExecutorService(Executors.newVirtualThreadPerTaskExecutor())
    )
    list.tasksupport =tasksupport

    list.map { a =>
      println("-par-----"+Thread.currentThread())
      a
    }

    val rnd = new Random().nextInt(100)
    println("-1----------------------"+Thread.currentThread() + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-1----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)


    Future.successful{
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
      println("--" + Thread.currentThread().getName + " @" + rnd)
      Thread.sleep(1000)
    }


    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)
    println("-2----------------------"+Thread.currentThread().getName + " @"+rnd)
    Thread.sleep(1000)

    Ok(views.html.index())
  }
}
