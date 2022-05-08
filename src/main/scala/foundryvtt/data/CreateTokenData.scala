package foundryvtt.data

import scala.scalajs.js

class CreateTokenData(
    val name: String,
    val displayName: js.UndefOr[Int],
    val actorId: String,
    val actorLink: js.UndefOr[Boolean],
    val img: js.UndefOr[String],
    val randomImg: js.UndefOr[Boolean],
    val tint: js.UndefOr[String],
    val width: js.UndefOr[Int],
    val height: js.UndefOr[Int],
    val scale: js.UndefOr[Float],
    val mirrorX: js.UndefOr[Boolean],
    val mirrorY: js.UndefOr[Boolean],
    val lockRotation: js.UndefOr[Boolean],
    val rotation: js.UndefOr[Int],
    val vision: js.UndefOr[Boolean],
    val dimSight: js.UndefOr[Float],
    val brightSight: js.UndefOr[Float],
    val sightAngle: js.UndefOr[Int],
    val light: js.UndefOr[js.Object], //FIXME: light
    val disposition: js.UndefOr[Int],
    val displayBars: js.UndefOr[Int],
    val bar1: js.UndefOr[js.Object], //FIXME: bars
    val bar2: js.UndefOr[js.Object], //FIXME: bars
) extends js.Object {}
