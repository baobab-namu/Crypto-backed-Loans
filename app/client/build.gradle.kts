plugins {
    id("base-conventions")
    id("kotlin-conventions")
    id("spring-web-conventions")
}

dependencies {
//    implementation project(':shared')
    implementation(project(":domain"))
//    implementation project(':app:infrastructure')
}