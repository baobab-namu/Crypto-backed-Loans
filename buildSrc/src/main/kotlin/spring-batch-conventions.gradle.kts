plugins {
    id("spring-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-batch")
    implementation("org.springframework.boot:spring-boot-starter-quartz")

//    testImplementation("org.springframework.batch:spring-batch-test")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    testImplementation("org.testcontainers:testcontainers:1.21.3")
//    testImplementation("org.testcontainers:junit-jupiter:1.21.3")
//    testImplementation("org.testcontainers:mysql:1.21.3")
//    testImplementation("org.testcontainers:localstack:1.21.3")
//    testImplementation("org.testcontainers:jdbc:1.21.3")
//    testImplementation("com.mysql:mysql-connector-j")
//    testImplementation("org.mockito.kotlin:mockito-kotlin:5.2.1")
//    testImplementation("p6spy:p6spy:3.9.1")
//    testImplementation("com.github.gavlyukovskiy:datasource-decorator-spring-boot-autoconfigure:1.9.0")
}
