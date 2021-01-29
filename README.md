# Huawei Javascript Map Demo  [![Kotlin](https://img.shields.io/badge/kotlin-1.4.21-green.svg)](https://kotlinlang.org/) [![Gradle Version](https://img.shields.io/badge/gradle-6.8.1-green.svg)](https://docs.gradle.org/current/release-notes)

### Embedded Google Maps API Key

1) Also it's required to activate Maps Javascript API. Note: this might cause costs based on quotas.

https://console.cloud.google.com/google/maps-apis/metrics?project=my-project

2) put key from https://console.cloud.google.com/apis/credentials?project=my-project&supportedpurview=project
to [app/src/main/assets/maps.html](app/src/main/assets/maps.html#6)

### How to build

    ./gradlew clean build

[![Screenshot](device-2021-01-29-123301.gif)](device-2021-01-29-123301.gif)

### License
<pre>
Copyright 2021 Jan Rabe

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
</pre>
