# Huawei Javascript Map Demo  [![Kotlin](https://img.shields.io/badge/kotlin-1.4.21-green.svg)](https://kotlinlang.org/) [![Gradle Version](https://img.shields.io/badge/gradle-6.8.1-green.svg)](https://docs.gradle.org/current/release-notes)

### Embedded Google Maps API Key

1) Also it's required to activate Maps Javascript API. Note: this might cause costs based on quotas.

https://console.cloud.google.com/google/maps-apis/metrics?project=my-project

2) put key from https://console.cloud.google.com/apis/credentials?project=my-project&supportedpurview=project
to [app/src/main/assets/maps.html](app/src/main/assets/maps.html#6)

### How to build

    ./gradlew clean build

[![Screenshot](device-2021-01-29-123301.gif)](device-2021-01-29-123301.gif)