@file:Suppress("ktlint")
package gg.jte.generated.ondemand
import org.example.HighScoreItem
@Suppress("UNCHECKED_CAST", "UNUSED_PARAMETER")
class Jte04_highScoresGenerated {
companion object {
	@JvmField val JTE_NAME = "04_highScores.kte"
	@JvmField val JTE_LINE_INFO = intArrayOf(0,0,0,3,3,3,3,3,8,8,8,9,9,9,9,9,9,10,10,12,12,12,3,3,3,3,3)
	@JvmStatic fun render(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, highScoreItems:List<HighScoreItem>) {
		jteOutput.writeContent("\n\n<table>\n   <tr> <th>Name </th> <th>Punkte</th> </tr>\n   ")
		for (item in highScoreItems) {
			jteOutput.writeContent("\n      <tr><td>")
			jteOutput.setContext("td", null)
			jteOutput.writeUserContent(item.playerName)
			jteOutput.writeContent("</td><td>")
			jteOutput.setContext("td", null)
			jteOutput.writeUserContent(item.score)
			jteOutput.writeContent("</td></tr>\n    ")
		}
		jteOutput.writeContent("\n</table>\n")
	}
	@JvmStatic fun renderMap(jteOutput:gg.jte.html.HtmlTemplateOutput, jteHtmlInterceptor:gg.jte.html.HtmlInterceptor?, params:Map<String, Any?>) {
		val highScoreItems = params["highScoreItems"] as List<HighScoreItem>
		render(jteOutput, jteHtmlInterceptor, highScoreItems);
	}
}
}
