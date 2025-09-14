plugins {
    id("base-conventions")
    id("kotlin-conventions")
    id("spring-conventions")
}

dependencies {
    implementation(project(":domain"))
}