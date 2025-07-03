
plugins {
	alias(libs.plugins.kmp)
}

group = "co.hondaya"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    macosArm64("native") {  // on macOS
    // linuxArm64("native") // on Linux
    // mingwX64("native")   // on Windows
        binaries {
            executable{
                entryPoint = "co.hondaya.main"
            }
        }
    }
    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation(libs.ktor.server.core)
                implementation(libs.ktor.server.cio)
            }
        }
    }
}

