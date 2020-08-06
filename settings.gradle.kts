pluginManagement {
    plugins {
        fun String.v() = extra["$this.version"].toString()
        fun PluginDependenciesSpec.idv(id: String, key: String = id) = id(id) version key.v()

        kotlin("js") version "kotlin".v()
    }
}

rootProject.name = "kotlinx-nodejs-sample"

