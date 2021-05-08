object AppConfig {

    const val KOTLIN_VERSION = "1.4.31"

    object Android {
        const val minSdk = 21
        const val compile = 30
        const val target = 30
    }

    object Libraries {

        private const val supportVersion = "29.0.0"
        private const val androidXVersion = "1.2.0"
        private const val lifeCycleVersion = "2.2.0"
        private const val roomVersion = "2.3.0"

        // Android
        const val APP_COMPAT = "androidx.appcompat:appcompat:$androidXVersion"
        const val KTX_CORE = "androidx.core:core-ktx:1.3.2"
        const val MATERIAL = "com.google.android.material:material:1.3.0"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val CARD_VIEW = "androidx.cardview:cardview:$androidXVersion"
        const val DESIGN = "com.android.support:design:$supportVersion"
        const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:$androidXVersion"
        const val LIFE_CYCLE_VIEW_MODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycleVersion"
        const val LIFE_CYCLE_EXTENSIONS =
            "androidx.lifecycle:lifecycle-extensions:$lifeCycleVersion"

        // Room
        const val ROOM_RUNTIME = "androidx.room:room-runtime:$roomVersion"
        const val ROOM_COMPILER = "androidx.room:room-compiler:$roomVersion"
        const val ROOM_TESTING = "androidx.room:room-testing:$roomVersion"

        // Koin
        private const val koinVersion = "2.0.1"
        const val KOIN_CORE = "org.koin:koin-core:$koinVersion"
        const val KOIN_SCOPE = "org.koin:koin-androidx-scope:$koinVersion"
        const val KOIN_VIEW_MODEL = "org.koin:koin-androidx-viewmodel:$koinVersion"
        const val KOIN_EXTENSIONS = "org.koin:koin-androidx-ext:$koinVersion"
        const val KOIN_JAVA = "org.koin:koin-java:$koinVersion"

        // Retrofit
        private const val retrofitVersion = "2.4.0"
        const val RETROFIT = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
        const val RX_JAVA_ADAPTER = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"
        const val RETROFIT_MOCK = "com.squareup.retrofit2:retrofit-mock:$retrofitVersion"
        const val RETROFIT_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.3.1"
        const val RETROFIT_ERROR_INTERCEPTOR =
            "com.github.jeancsanchez:okhttp-rest-error-interceptor:2.1.0"

        // Others
        const val HAWK = "com.orhanobut:hawk:2.0.1"
        const val GLIDE = "com.github.bumptech.glide:glide:4.12.0"
    }

    object TestLibraries {
        const val JUNIT = "junit:junit:4.12"
        const val JUNIT_EXTENSION = "androidx.test.ext:junit:1.1.2"
        const val TEST_RUNNER = "androidx.test:runner:1.1.0"
        const val TEST_RULES = "androidx.test:rules:1.1.0"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:3.1.0"

        // Mockito
        private const val mockitoVersion = "2.13.0"
        const val MOCKITO_ALL = "org.mockito:mockito-all:1.10.19"
        const val MOCKITO_CORE = "org.mockito:mockito-core:$mockitoVersion"
        const val MOCKITO_ANDROID = "org.mockito:mockito-android:$mockitoVersion"
        const val MOCKITO_KOTLIN = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.0.0"
    }
}