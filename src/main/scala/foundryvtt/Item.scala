package foundryvtt

import foundryvtt.abstracts.Document
import foundryvtt.data.ItemData
import foundryvtt.documents.BaseItem

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("Item")
class Item[T](data: ItemData[T], context: js.UndefOr[DocumentModificationContext]) extends Document[T] with BaseItem[T] {
  override def data: ItemData[T] = js.native
}
