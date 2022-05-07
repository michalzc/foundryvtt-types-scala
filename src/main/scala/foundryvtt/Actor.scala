package foundryvtt

import foundryvtt.abstracts.Document
import foundryvtt.data.ActorData
import foundryvtt.documents.BaseActor

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("Actor")
class Actor[T, U](data: ActorData[T], context: js.UndefOr[DocumentModificationContext]) extends Document[T] with BaseActor[T] {
  override def data: ActorData[T] = js.native

}
