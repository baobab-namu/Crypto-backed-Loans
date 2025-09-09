val kotlin_gradle_plugin: String by project
val spring_boot_gradle_plugin: String by project
val spring_dependency_management_plugin: String by project

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}


dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:$spring_boot_gradle_plugin")
    implementation("io.spring.gradle:dependency-management-plugin:$spring_dependency_management_plugin")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_gradle_plugin")
    implementation("org.jetbrains.kotlin:kotlin-allopen:$kotlin_gradle_plugin")
    implementation("org.jetbrains.kotlin:kotlin-noarg:$kotlin_gradle_plugin")
}