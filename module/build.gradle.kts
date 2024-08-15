plugins {
  kotlin("multiplatform") version "2.0.0"
}

repositories {
  mavenCentral()
}

kotlin {
  linuxX64()
  //macosX64()
  //mingwX64()

  sourceSets {
    commonMain {
    }

    commonTest {
    }
  }
}
