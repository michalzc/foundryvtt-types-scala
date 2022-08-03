package foundryvtt.forms

import foundryvtt.Actor

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("ActorSheet")
class ActorSheet[T, A <: Actor[T]](actor: A, options: js.UndefOr[js.Object]) extends js.Object {

  def getData(): js.Object = js.native
}

@js.native
@JSGlobal
object ActorSheet extends js.Object {
  def defaultOptions: js.Object = js.native
}
