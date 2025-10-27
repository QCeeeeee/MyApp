pluginManagement {
    repositories {
        // 1. 腾讯云 Maven 代理（含 Google、Gradle Plugin）
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
        // 2. 如果腾讯云没命中，自动回退到官方
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // 同样先走腾讯镜像
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
        google()
        mavenCentral()
    }
}

rootProject.name = "MyFirstApp"
include(":app")
