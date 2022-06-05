package foundryvtt
import scala.scalajs.js.annotation.JSGlobal
import scalajs.js

@js.native
@JSGlobal
object Hooks extends js.Object {
  def once[FUN](callbackName: String, fun: FUN): Unit = js.native
}
