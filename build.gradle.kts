plugins {
    java
    id("org.jetbrains.kotlin.jvm") version "2.1.0" // For Kotlin
}

group = "com.exanthiax"
version = "1.0.0"

repositories {
    mavenCentral()

    // Paper API (Bukkit base)
    maven("https://repo.papermc.io/repository/maven-public/")

    // Eco repository
    maven("https://repo.auxilor.io/repository/maven-public")

    // Nexo repository
    maven("https://repo.nexomc.com/releases")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT") // Use latest Paper API
    compileOnly("com.willfp:eco:6.75.0") // Eco
    compileOnly("com.nexomc:nexo:0.7.0") // Nexo
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // Adjust to your server's Java version
    }
}
