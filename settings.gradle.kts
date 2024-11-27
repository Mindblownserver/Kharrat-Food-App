import java.util.Properties

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven { setUrl("https://maven.pkg.github.com/Cuberto/liquid-swipe-android") }

    }
}

val githubProperties = Properties().apply {
    file("github.properties").takeIf { it.exists() }?.inputStream()?.use { load(it) }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/Cuberto/liquid-swipe-android")
            credentials {
                username = githubProperties["gpr.user"]?.toString() ?: ""
                password = githubProperties["gpr.key"]?.toString() ?: ""
            }
        }

    }
}

rootProject.name = "Food App"
include(":app")
 