plugins {
    val kotlinVersion = "1.7.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.14.0"
}

group = "cn.whitrayhb"
version = "1.2.1"

repositories {
    if (System.getenv("CI")?.toBoolean() != true) {
        maven("https://maven.aliyun.com/repository/public") // 阿里云国内代理仓库
    }
    mavenCentral()
}

dependencies {
    implementation("org.json:json:20230227")
    compileOnly("net.mamoe:mirai-core-jvm:2.14.0")
}

tasks.withType<Jar>() {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

mirai {
    jvmTarget = JavaVersion.VERSION_17
}