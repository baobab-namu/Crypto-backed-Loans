plugins {
	id("org.springframework.boot")
	id("io.spring.dependency-management")
	id("org.jetbrains.kotlin.jvm")
	id("org.jetbrains.kotlin.plugin.spring")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-validation")
}
