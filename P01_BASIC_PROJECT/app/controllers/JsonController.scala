package controllers

import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class JsonController @Inject() (
    cc: ControllerComponents
)(using
    ExecutionContext
) extends AbstractController(cc):

  def index() = Action {
    Ok("aaa")
  }
