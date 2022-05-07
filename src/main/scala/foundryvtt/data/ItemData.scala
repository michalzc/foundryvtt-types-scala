package foundryvtt.data

import foundryvtt.abstracts.DocumentData
import foundryvtt.data.ItemData.InputItemData
import foundryvtt.documents.BaseItem
import foundryvtt.support.{Flags, Permission}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}
import scala.scalajs.js.|

@js.native
@JSGlobal("data.ItemData")
class ItemData[T](data: InputItemData[T], document: BaseItem[_]) extends DocumentData {
  def name: String = js.native
  @JSName("type")
  def `type`: String                     = js.native
  def img: js.UndefOr[String]            = js.native
  def data: js.UndefOr[T]                = js.native
  def effects: js.Map[String, js.Object] = js.native //FIXME: effect data
  def folder: String                     = js.native
  def sort: js.UndefOr[Int]              = js.native
  def permission: js.UndefOr[Permission] = js.native
  def flags: js.UndefOr[Flags]           = js.native
}

object ItemData {
  type InputItemData[T] = ItemData[T] | CreateItemData[T]
}
