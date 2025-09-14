plugins {
    id("base-conventions")
    id("kotlin-conventions")
    id("spring-conventions")
    id("spring-batch-conventions")
}

dependencies {
    implementation(project(":batch:application"))
    implementation(project(":batch:infrastructure"))
}