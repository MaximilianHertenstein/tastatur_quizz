plugins {
    kotlin("jvm") version "2.1.10"
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



}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}