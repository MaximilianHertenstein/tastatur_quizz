@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class Jte05_highscore_formGenerated {
companion object {
	@JvmField val JTE_NAME = "05_highscore_form.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,0,0,0,0,5,5,5,5,5,5,5,5,5,5,7,7,7,0,0,0,0,0)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, score:Int) {
		jteOutput.writeContent("\n<form method=\"post\" action=\"/registerHighScore\">\n    <label for=\"name\">Name</label>\n    <input type=\"text\" name=\"name\">\n    <input type=\"hidden\" name=\"score\"")
		val __jte_html_attribute_0 = score
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"")
			jteOutput.setContext("input", "value")
			jteOutput.writeUserContent(__jte_html_attribute_0)
			jteOutput.setContext("input", null)
			jteOutput.writeContent("\"")
		}
		jteOutput.writeContent(" />\n    <button type=\"submit\">Send</button>\n</form>")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val score = params["score"] as Int
		render(jteOutput, jteHtmlInterceptor, score);
	}
}
}
