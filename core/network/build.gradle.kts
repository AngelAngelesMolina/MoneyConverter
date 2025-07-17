plugins{
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")

}

android{
    namespace = "com.mc.network"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        targetSdk = 35

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
}