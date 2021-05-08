plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(AppConfig.Android.compile)
    buildToolsVersion("30.0.3")

    defaultConfig {
        applicationId = "br.com.jeancsanchez.chucknorrisapp"
        minSdkVersion(AppConfig.Android.minSdk)
        targetSdkVersion(AppConfig.Android.target)
        versionCode(1)
        versionName("1.0")

        javaCompileOptions {
            annotationProcessorOptions {
                arguments["room.schemaLocation"] = "$projectDir/schemas"
                arguments["room.incremental"] = "true"
                arguments["room.expandProjection"] = "true"
            }
        }

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }
}

dependencies {
    kotlin("stdlib", AppConfig.KOTLIN_VERSION)

    implementation(AppConfig.Libraries.APP_COMPAT)
    implementation(AppConfig.Libraries.KTX_CORE)
    implementation(AppConfig.Libraries.MATERIAL)
    implementation(AppConfig.Libraries.CONSTRAINT_LAYOUT)

    implementation(AppConfig.Libraries.RETROFIT)
    implementation(AppConfig.Libraries.RETROFIT_MOCK)
    implementation(AppConfig.Libraries.RETROFIT_LOGGING_INTERCEPTOR)
    implementation(AppConfig.Libraries.RETROFIT_ERROR_INTERCEPTOR)
    implementation(AppConfig.Libraries.GSON_CONVERTER)

    implementation(AppConfig.Libraries.ROOM_RUNTIME)
    kapt(AppConfig.Libraries.ROOM_COMPILER)

    implementation(AppConfig.Libraries.KOIN_CORE)
    implementation(AppConfig.Libraries.KOIN_EXTENSIONS)
    implementation(AppConfig.Libraries.KOIN_SCOPE)
    implementation(AppConfig.Libraries.KOIN_JAVA)
    implementation(AppConfig.Libraries.KOIN_VIEW_MODEL)

    testImplementation(AppConfig.TestLibraries.JUNIT)
    testImplementation(AppConfig.TestLibraries.JUNIT_EXTENSION)
    testImplementation(AppConfig.Libraries.ROOM_TESTING)
    testImplementation(AppConfig.Libraries.KOIN_TESTING)
    androidTestImplementation(AppConfig.TestLibraries.ESPRESSO)
}