@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class Jte01_titleGenerated {
companion object {
	@JvmField val JTE_NAME = "01_title.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(16,16,16,16,16,16,16,16,16,16,16,16,16,16,16)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?) {
		jteOutput.writeContent("<!DOCTYPE html>\r\n<html>\r\n<head>\r\n    <script src=\"/webjars/htmx.org/2.0.4/dist/htmx.min.js\"></script>\r\n\r\n    </head>\r\n\r\n\r\n\r\n<body>\r\n    <div id=\"anzeige\">\r\n        <h1>Tastatur-Spiel</h1>\r\n        <h2>Knacke den GHSE-Highscore!</h2>\r\n        <button hx-get=\"/tasks\" hx-target=\"#anzeige\" hx-swap=\"innerHTML\">Los geht's!</button>\r\n    </div>\r\n</body>\r\n</html>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
