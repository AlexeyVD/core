package com.avd.avdcore.ext

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.util.Log

/**
 * @return String item value from string array resource [id] by [itemId]
 */
fun Context.getStringArrayItem(id: Int, itemId: Int) = resources.getStringArray(id)[itemId]

/**
 * @return value from string resources by [key]
 */
fun Context.getStringByKey(key: String): String {
    val id = resources.getIdentifier(key, "string", packageName)
    if (id == 0) return key
    return getString(id)
}

/**
 * @return application version
 */
fun Context.getAppVersion(): String {
    val pInfo: PackageInfo
    try {
        pInfo = packageManager.getPackageInfo(packageName, 0)
        return "v" + pInfo.versionName
    } catch (e: PackageManager.NameNotFoundException) {
        Log.e("ContextExt", e.message)
    }
    return "1.0.0"
}