plugins {
    kotlin("jvm") version "2.2.0"
}

group = "com.vyuzzzh.bookpedia"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}