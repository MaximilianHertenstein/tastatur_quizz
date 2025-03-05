@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import gg.jte.Content
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtelayoutGenerated {
companion object {
	@JvmField val JTE_NAME = "layout.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,11,11,20,20,20,23,23,23,2,2,2,2,2)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, content:Content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html>\n<head>\n    <meta charset=\"utf-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n    <meta name=\"color-scheme\" content=\"light dark\" />\n    <link rel=\"stylesheet\" href=\"css/pico.min.css\">\n")
		jteOutput.writeContent("\n    <script src=\"/webjars/htmx.org/2.0.4/dist/htmx.min.js\"></script>\n\n</head>\n\n\n\n<body>\n        <div class=\"container\">\n        ")
		jteOutput.setContext("div", null)
		jteOutput.writeUserContent(content)
		jteOutput.writeContent("\n        </div>\n</body>\n</html>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val content = params["content"] as Content
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
}
