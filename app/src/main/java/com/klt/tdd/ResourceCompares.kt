package com.klt.tdd

import android.content.Context

class ResourceCompares {
    fun isEqual(
        context: Context,
        resId: Int,
        string: String
    ) : Boolean {
        return context.getString(resId) == string
    }
}