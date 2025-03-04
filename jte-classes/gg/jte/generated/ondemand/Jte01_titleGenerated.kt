@file:Suppress("ktlint")
package gg.jte.generated.ondemand
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class Jte01_titleGenerated {
companion object {
	@JvmField val JTE_NAME = "01_title.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(1,1,1,1,1,1,1,1,1,3,3,11,11,11,13,13,13,13,13,13,13)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?) {
		jteOutput.writeContent("\r\n")
		gg.jte.generated.ondemand.JtelayoutGenerated.render(jteOutput, jteHtmlInterceptor, object : gg.jte.html.HtmlContent {
			override fun writeTo(jteOutput:gg.jte.html.HtmlTemplateOutput) {
				jteOutput.writeContent("\r\n<div id=\"anzeige\">\r\n    <h1>Tastatur-Spiel</h1>\r\n    <h2>Knacke den GHSE-Highscore!</h2>\r\n    <p>\r\n        <button hx-get=\"/keyPressed\" hx-target=\"#anzeige\"> Los geht's!</button>\r\n    </p>\r\n    <p><a href=\"/highscores\"> Highscores</a></p>\r\n</div>")
			}
		});
		jteOutput.writeContent("\r\n\r\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
}
