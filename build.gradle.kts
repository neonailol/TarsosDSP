
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
    id("org.openjfx.javafxplugin") version "0.0.8"
    application
}

repositories {
    jcenter()
}

javafx {
    version = "13"
    modules = listOf("javafx.controls")
}

sourceSets {
    main {
        java {
            srcDirs("src/core", "src/examples", "src/jvm")
        }
    }
    test {
        java {
            srcDirs("src/tests", "src/experimental")
        }
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "TarsosDSP.AppKt"
}
