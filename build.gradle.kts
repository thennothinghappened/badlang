plugins {
    kotlin("jvm") version "1.8.0"
    application
}

application {
    mainClass.set("org.orca.badlang.AppKt")
}

group = "org.orca.badlang"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-cli:0.3.5")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName<JavaExec>("run") {
    standardInput = System.`in`
}

kotlin {
    jvmToolchain(8)
}