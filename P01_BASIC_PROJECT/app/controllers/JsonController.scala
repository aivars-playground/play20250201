package controllers

import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class JsonController @Inject() (
    cc: ControllerComponents,
    implicit val ec: ExecutionContext
) extends AbstractController(cc):

  def index() = Action {
    Ok("aaa")
  }
