package de.check24.huawei.maps.misc

import com.github.florent37.application.provider.application
import timber.log.Timber


fun String.stringFromAssets(): String = try {
    application!!.assets.open(this).bufferedReader().use { it.readText() }
} catch (e: Exception) {
    Timber.e(e)
    ""
}