package com.ecommerceconcept.app.utils

import android.content.res.Resources
import android.util.TypedValue

    fun Int.toPx() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )
