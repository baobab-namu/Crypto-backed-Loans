import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("jvm")
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-parameters")
}

repositories {
    mavenCentral()
}
