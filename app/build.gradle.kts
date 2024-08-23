plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.cihangirs"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.cihangirs"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //implementation("org.eclipse.paho:org.eclipse.paho.android.service:1.1.1")
    //new mqtt library that supports android 12
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.github.hannesa2:paho.mqtt.android:3.6.4")
    //implementation("com.github.hannesa2:paho.mqtt.android:$latestVersion")

    implementation("org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.2.5")

    //implementation("androidx.localbroadcastmanager:localbroadcastmanager:1.0.0")
    //implementation("com.android.support:support-v4:28.0.0")

}