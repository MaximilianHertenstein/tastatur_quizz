@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import org.example.GameState
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class Jte02_tasksGenerated {
companion object {
	@JvmField val JTE_NAME = "02_tasks.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,3,3,3,3,3,5,5,7,8,9,10,12,14,14,14,21,21,21,23,24,24,24,3,3,3,3,3)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, gameState:GameState) {
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n\r\n")
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n\r\n")
		jteOutput.writeContent("\r\n    <h1>Drücke</h1>\r\n    <p>")
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(gameState.lastKey)
		jteOutput.writeContent("</p>\r\n\r\n    <div hx-get=\"/keyPressed\"  hx-target=\"#anzeige\"  hx-trigger=\"keyup\" hx-vals='js:{key: event.key}' >\r\n        <input name=\"someinput\" type=\"text\" autofocus style=\"opacity:0\" />\r\n\r\n\r\n    </div>\r\n    <p>Punkte: ")
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(gameState.score)
		jteOutput.writeContent(" </p>\r\n\r\n")
		jteOutput.writeContent("\r\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val gameState = params["gameState"] as GameState
		render(jteOutput, jteHtmlInterceptor, gameState);
	}
}
}
