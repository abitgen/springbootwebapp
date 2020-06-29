plugins {
    java
    kotlin("jvm")
    kotlin("plugin.spring") version "1.3.72"
    id("org.springframework.boot") version "2.3.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
}

group = "guru.springframework"
version = "1.0-SNAPSHOT"

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}


repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation(group= "junit", name= "junit", version= "4.12")
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.3.1.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-security:2.3.1.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.3.1.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-web:2.3.1.RELEASE")
    implementation("org.webjars:bootstrap:4.5.0")
    implementation("org.webjars:jquery:3.5.1")
    implementation("com.h2database:h2:1.4.200")
    testImplementation( "org.springframework.boot:spring-boot-starter-test:2.3.1.RELEASE")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}