plugins {
  kotlin("multiplatform") version "1.9.22"
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
