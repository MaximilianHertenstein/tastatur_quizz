plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}


dependencies {
    testImplementation(kotlin("test"))
    implementation("io.javalin:javalin:6.4.0")
    implementation("io.javalin:javalin-rendering:6.4.0")
    implementation("gg.jte:jte:3.1.16")
    implementation("gg.jte:jte-kotlin:3.1.16")
    implementation("org.slf4j:slf4j-simple:2.0.16")
    implementation("org.webjars.npm:htmx.org:2.0.4")
    implementation("org.webjars.npm:fontsource-variable__jetbrains-mono:5.0.6")
    implementation("org.webjars.npm:picocss__pico:2.0.6")
}


tasks.test {
    useJUnitPlatform()
}


kotlin {
    jvmToolchain(21)
}