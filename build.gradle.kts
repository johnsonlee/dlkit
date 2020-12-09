buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.0.2")
    }
}

allprojects {
    group = "io.johnsonlee.dlkit"
    version = "1.0.0"
    repositories {
        google()
        jcenter()
        mavenCentral()
        repositories {
            maven { url = uri("https://dl.bintray.com/korlibs/korlibs/") }
        }
    }
}