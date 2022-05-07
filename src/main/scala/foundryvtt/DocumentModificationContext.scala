package foundryvtt

import foundryvtt.abstracts.Document

import scala.scalajs.js

@js.native
trait DocumentModificationContext extends js.Object {
  def parent[T]: js.UndefOr[Document[T]] = js.native
  def pack: js.UndefOr[String] = js.native
  def noHook: js.UndefOr[Boolean] = js.native
  def index: js.UndefOr[Boolean] = js.native
  def indexFields: js.UndefOr[js.Array[String]] = js.native
  def keepId: js.UndefOr[Boolean] = js.native
  def keepEmbeddedIds: js.UndefOr[Boolean] = js.native
  def temporary: js.UndefOr[Boolean] = js.native
  def render: js.UndefOr[Boolean] = js.native
  def renderSheet: js.UndefOr[Boolean] = js.native
  def diff: js.UndefOr[Boolean] = js.native
  def recursive: js.UndefOr[Boolean] = js.native
  def isUndo: js.UndefOr[Boolean] = js.native
  def deleteAll: js.UndefOr[Boolean] = js.native
}
