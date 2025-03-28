package org.example

import io.javalin.Javalin
import io.javalin.rendering.template.JavalinJte
import org.example.view.renderTitle

fun main() {

    val app = Javalin.create { config ->
        config.staticFiles.add("/public")
        config.fileRenderer(JavalinJte())
        config.staticFiles.enableWebjars()

    }
    val controller = Controller()


    app.get("/", ::renderTitle)

    app.get("/highScores", controller::showHighScores)

    app.get("/keyPressed",controller::handlePressedKey)

    app.post("/registerHighScore",controller::registerHighScore)

    app.start(7000)

}

