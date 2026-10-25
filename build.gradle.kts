plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ksp) apply false
}

// Папка проекта лежит по длинному пути, а сборка Android создаёт очень длинные
// вложенные пути. Чтобы не упереться в лимит Windows (260 символов), выносим build наружу.
allprojects {
    if (System.getProperty("os.name").startsWith("Windows")) {
        layout.buildDirectory.set(file("C:/Temp/satbayevplus-build/${project.name}"))
    }
}
