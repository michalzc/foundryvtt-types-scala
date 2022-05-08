package foundryvtt.data

import foundryvtt.abstracts.DocumentData

import scala.scalajs.js

@js.native
trait PrototypeTokenData extends DocumentData {
  def name: String                      = js.native
  def displayName: js.UndefOr[Int]      = js.native
  def actorId: String                   = js.native
  def actorLink: js.UndefOr[Boolean]    = js.native
  def img: String                       = js.native
  def randomImg: js.UndefOr[Boolean]    = js.native
  def tint: js.UndefOr[String]          = js.native
  def width: js.UndefOr[Int]            = js.native
  def height: js.UndefOr[Int]           = js.native
  def scale: js.UndefOr[Float]          = js.native
  def mirrorX: js.UndefOr[Boolean]      = js.native
  def mirrorY: js.UndefOr[Boolean]      = js.native
  def lockRotation: js.UndefOr[Boolean] = js.native
  def rotation: js.UndefOr[Int]         = js.native
  def vision: js.UndefOr[Boolean]       = js.native
  def dimSight: js.UndefOr[Float]       = js.native
  def brightSight: js.UndefOr[Float]    = js.native
  def sightAngle: js.UndefOr[Int]       = js.native
  def light: js.UndefOr[js.Object]      = js.native //FIXME: Light data
  def disposition: js.UndefOr[Int]      = js.native
  def displayBars: js.UndefOr[Int]      = js.native
  def bar1: js.UndefOr[js.Object]       = js.native //FIXME: bars
  def bar2: js.UndefOr[js.Object]       = js.native
}
