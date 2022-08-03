package foundryvtt.collection

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportStatic, JSExportTopLevel, JSGlobal}
import scala.scalajs.js.JSConverters._

@js.native
@JSGlobal("Actors")
object Actors extends js.Object {
  def registerSheet(module: String, sheetClass: js.Dynamic, options: SheetOptions): Unit = js.native
  def unregisterSheet(module: String, sheetClass: js.Dynamic) = js.native
}

@JSExportTopLevel("SheetOptions")
class SheetOptions(
    val label: String,
    val types: js.Array[String],
    val makeDefault: Boolean,
) extends js.Object
