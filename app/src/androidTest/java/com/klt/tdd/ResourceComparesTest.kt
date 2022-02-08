package com.klt.tdd

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparesTest{

    lateinit var resourceCompares  : ResourceCompares

    @Before
    fun setupResourceCompares(){
        resourceCompares = ResourceCompares()
    }

    @After
    fun tearDownResourceCompares() {
        //this will clear Instance of resourceCompares
    }

    @Test
    fun stringResource_Same_as_givenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompares.isEqual(
            context = context,
            resId = R.string.app_name,
            string = "TDD"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun stringResource_notEqual_as_givenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompares.isEqual(
            context = context,
            resId = R.string.app_name,
            string = "appName"
        )
        assertThat(result).isFalse()
    }
}