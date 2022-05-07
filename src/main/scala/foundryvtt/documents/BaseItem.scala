package foundryvtt.documents

import foundryvtt.data.ItemData

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait BaseItem[T] extends js.Object {
  def data: ItemData[T] = js.native
  @JSName("type")
  def `type`: String = js.native
}
