plugins {
    id("base-conventions")
    id("kotlin-conventions")
    id("spring-conventions")
    id("test-conventions")
}

dependencies {
    implementation(project(":domain"))
}