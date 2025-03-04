@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class Jte02_tasksGenerated {
companion object {
	@JvmField val JTE_NAME = "02_tasks.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,0,0,0,0,3,3,5,6,7,8,10,12,12,12,19,19,19,21,22,22,22,0,1,1,1,1,1)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, key:String, score:Int) {
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n\r\n")
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n")
		jteOutput.writeContent("\r\n\r\n")
		jteOutput.writeContent("\r\n    <h1>Drücke</h1>\r\n    <p>")
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(key)
		jteOutput.writeContent("</p>\r\n\r\n    <div hx-get=\"/keyPressed\"  hx-target=\"#anzeige\"  hx-trigger=\"keyup\" hx-vals='js:{key: event.key}' >\r\n        <input name=\"someinput\" type=\"text\" autofocus style=\"opacity:0\" />\r\n\r\n\r\n    </div>\r\n    <p>Punkte: ")
		jteOutput.setContext("p", null)
		jteOutput.writeUserContent(score)
		jteOutput.writeContent(" </p>\r\n\r\n")
		jteOutput.writeContent("\r\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val key = params["key"] as String
		val score = params["score"] as Int
		render(jteOutput, jteHtmlInterceptor, key, score);
	}
}
}
