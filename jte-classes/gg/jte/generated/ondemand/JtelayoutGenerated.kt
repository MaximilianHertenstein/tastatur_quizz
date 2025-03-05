@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import gg.jte.Content
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class JtelayoutGenerated {
companion object {
	@JvmField val JTE_NAME = "layout.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,2,2,2,2,2,15,15,15,15,17,17,17,2,2,2,2,2)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, content:Content) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html>\n<head>\n    <link rel=\"stylesheet\" href=\"styles.css\">\n    <script src=\"/webjars/htmx.org/2.0.4/dist/htmx.min.js\"></script>\n\n</head>\n\n\n\n<body>\n        ")
		jteOutput.setContext("body", null)
		jteOutput.writeUserContent(content)
		jteOutput.writeContent("\n</body>\n</html>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val content = params["content"] as Content
		render(jteOutput, jteHtmlInterceptor, content);
	}
}
}
