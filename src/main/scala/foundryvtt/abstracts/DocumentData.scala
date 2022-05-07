package foundryvtt.abstracts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
trait DocumentData[T] extends js.Object {
  def _id: String  = js.native
  def name: String = js.native
  @JSName("type")
  def `type`: String          = js.native
  def img: js.UndefOr[String] = js.native
  def data: T = js.native
  //  def effects:
  def folder: js.UndefOr[String] = js.native
  def sort: js.UndefOr[Int] = js.native
  //  def permission:
  //  def flags:
}
