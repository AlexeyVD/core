package com.avd.avdcore.ext

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

/**
 * Set View background color by [colorId]
 */
fun View.setBackgroundColorById(colorId: Int) {
    setBackgroundColor(ContextCompat.getColor(context, colorId))
}

/**
 * Set View background drawable by [drawableId]
 */
fun View.setBackgroundDrawableById(drawableId: Int) {
    background = ContextCompat.getDrawable(context, drawableId)
}

/**
 * Set TextView text color by [colorId]
 */
fun TextView.setTextColorById(colorId: Int) {
    setTextColor(ContextCompat.getColor(context, colorId))
}

/**
 * Set Button text color by [colorId]
 */
fun Button.setTextColorById(colorId: Int) {
    setTextColor(ContextCompat.getColor(context, colorId))
}

/**
 * Set view visibility to [View.GONE]
 */
fun View.gone() {
    visibility = View.GONE
}

/**
 * Set view visibility to [View.INVISIBLE]
 */
fun View.invisible() {
    visibility = View.INVISIBLE
}

/**
 * Set view visibility to [View.VISIBLE]
 */
fun View.visible() {
    visibility = View.VISIBLE
}

/**
 * Close system keyboard
 */
fun View.closeKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE)
            as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}