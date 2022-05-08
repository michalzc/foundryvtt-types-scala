package foundryvtt.data

import foundryvtt.data.CreateActorData.TokenInput
import foundryvtt.support.{Flags, Permission}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

class CreateActorData[T](
    val name: String,
    @JSName("type")
    val `type`: String,
    val img: js.UndefOr[String],
    val data: js.UndefOr[T],
    val token: js.UndefOr[TokenInput],
    val items: js.Array[CreateItemData[_]],
    val effects: js.Array[js.Object], //FIXME: Effects
    val folder: js.UndefOr[String],
    val sort: js.UndefOr[Int],
    val permission: js.UndefOr[Permission],
    val flags: js.UndefOr[Flags],
) extends js.Object

object CreateActorData {
  type TokenInput = PrototypeTokenData | CreateTokenData
}
