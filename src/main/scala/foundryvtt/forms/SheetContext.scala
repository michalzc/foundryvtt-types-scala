package foundryvtt.forms

import foundryvtt.Actor
import foundryvtt.data.ActorData

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal
class SheetContext[T, A <: Actor[T]](
    val actor: A,
    val data: ActorData[T],
) extends js.Object {}
