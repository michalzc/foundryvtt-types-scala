package foundryvtt.abstracts

import scala.scalajs.js

@js.native
trait Document[T] extends js.Object {
  def id: js.UndefOr[String] = js.native
  def collectionName: String = js.native
  def data: DocumentData = js.native
  def documentName: String = js.native
  def isEmbedded: String = js.native
  def name: js.UndefOr[String] = js.native
  def pack: js.UndefOr[String] = js.native
  def parent[P <: Document[_]]: js.UndefOr[P] = js.native
}

//@js.native
//@JSGlobal("abstract.Document")
//object Document extends js.Object {
//
//
//}