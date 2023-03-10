package com.github.st235.circularprogressbar.utils

import android.content.res.Resources
import android.util.TypedValue
import androidx.annotation.Px

/**
 * Converts values to its real pixel size
 * using system density factor
 *
 * @return value in pixels
 */
@get:Px
internal val Int.dp: Int
    get() {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, this.toFloat(),
            Resources.getSystem().displayMetrics
        ).toInt()
    }

/**
 * Converts values to its real pixel size
 * using system density factor
 *
 * @return value in pixels
 */
@get:Px
internal val Float.dp: Float
    get() {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, this,
            Resources.getSystem().displayMetrics
        )
    }
