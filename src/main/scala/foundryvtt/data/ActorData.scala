package foundryvtt.data

import foundryvtt.abstracts.DocumentData
import foundryvtt.data.ActorData.InputActorData
import foundryvtt.documents.{BaseActor, BaseItem}
import foundryvtt.support.{Flags, Permission}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSName}
import scala.scalajs.js.|

@js.native
@JSGlobal("data.ActorData")
class ActorData[T](data: InputActorData[T], document: js.UndefOr[BaseActor[_]]) extends DocumentData {
  def name: String = js.native
  @JSName("type")
  def `type`: String                     = js.native
  def img: js.UndefOr[String]            = js.native
  def data: T                            = js.native
  def token: js.Object                   = js.native //FIXME: token prototype
  def items: js.Map[String, BaseItem[_]] = js.native
  def effects: js.Map[String, js.Object] = js.native //FIXME: effects
  def folder: String                     = js.native
  def sort: js.UndefOr[Int]              = js.native
  def permission: js.UndefOr[Permission] = js.native
  def flags: js.UndefOr[Flags]           = js.native

}

object ActorData {
  type InputActorData[T] = ActorData[T] | CreateActorData[T]
}
