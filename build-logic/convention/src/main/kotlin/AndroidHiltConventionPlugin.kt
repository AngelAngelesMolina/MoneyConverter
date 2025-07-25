import com.mc.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.devtools.ksp")
                apply("dagger.hilt.android.plugin")
            }

            dependencies {
                "implementation"(
                    libs.findLibrary("hilt.android").get()// setting hilt from version catalog
                ) //Getting from Project extension
                "ksp"(libs.findLibrary("hilt.compiler").get()) //setting hilt compiler from version catalog
            }
        }
    }
}