package foundryvtt.forms

import foundryvtt.Actor

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("ActorSheet")
class ActorSheet[T](actor: Actor[T], options: js.UndefOr[js.Object]) extends js.Object {}

@js.native
@JSGlobal
object ActorSheet extends js.Object {
  def defaultOptions: js.Object = js.native
}
