plugins {
    id("base-conventions")
    id("kotlin-conventions")
    id("spring-web-conventions")
}

dependencies {
    implementation(project(":domain"))
}