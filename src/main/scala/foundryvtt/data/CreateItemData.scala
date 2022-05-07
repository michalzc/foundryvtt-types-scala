package foundryvtt.data

import foundryvtt.support.{Flags, Permission}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

class CreateItemData[T](
    val name: String,
    @JSName("type")
    val `type`: String,
    val img: js.UndefOr[String],
    val data: T,
    val effects: js.UndefOr[js.Map[String, js.Object]], //FIXME: Effect type
    val folder: js.UndefOr[String],
    val sort: js.UndefOr[Int],
    val permission: js.UndefOr[Permission],
    val flags: js.UndefOr[Flags],
) extends js.Object
