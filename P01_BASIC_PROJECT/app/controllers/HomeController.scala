package controllers

import play.api.*
import play.api.mvc.*

import javax.inject.*
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Random

@Singleton
class HomeController @Inject()(
  val controllerComponents: ControllerComponents,
  implicit val ect: ExecutionContext
) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>


    val rnd = new Random().nextInt(100)
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
