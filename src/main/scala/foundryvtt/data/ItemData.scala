package foundryvtt.data

import foundryvtt.abstracts.{Document, DocumentData}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("ItemData")
class ItemData[T](data: T, document: Document[_]) extends DocumentData[T]