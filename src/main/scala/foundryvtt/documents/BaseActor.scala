package foundryvtt.documents

import foundryvtt.data.ActorData

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait BaseActor[T] extends js.Object {
  @JSName("type")
  def `type`: String = js.native
  def data: ActorData[T] = js.native
}
