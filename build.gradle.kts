plugins {
    kotlin("js")
}

allprojects {
    repositories {
        jcenter()
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile>().configureEach {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
}

val String.v: String get() = rootProject.extra["$this.version"] as String

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:${"kotlinx-nodejs".v}")
    implementation(npm("@actions/glob", "0.1.0", generateExternals = true))
}
