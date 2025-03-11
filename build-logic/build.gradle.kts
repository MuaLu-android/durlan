plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}
dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}