plugins {
    id("com.android.application")
    kotlin("android")
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

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isShrinkResources = false

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

    testImplementation(AppConfig.TestLibraries.JUNIT)
    testImplementation(AppConfig.TestLibraries.JUNIT_EXTENSION)
    androidTestImplementation(AppConfig.TestLibraries.ESPRESSO)
}