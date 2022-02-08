package com.klt.tdd

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    // 1.phoneNumber, password , confirmPassword is empty
    @Test
    fun `empty phone number returns false`() {
        val result = RegistrationUtil.validate(
            phoneNumber = "",
            password = "12345678",
            confirmPassword = "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validate(
            phoneNumber = "09402656594",
            password = "",
            confirmPassword = "12345678"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty confirm password returns false`() {
        val result = RegistrationUtil.validate(
            phoneNumber = "09402656594",
            password = "12345678",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    //2. password length less than 8
    @Test
    fun `password less than 8 returns false`() {
        val result = RegistrationUtil.validate(
            phoneNumber = "09402656594",
            password = "123",
            confirmPassword = "12345678"
        )
        assertThat(result).isFalse()
    }

    //3. confirmPassword is not the same as password
    @Test
    fun `incorrect confirm password with password returns false`() {
        val result = RegistrationUtil.validate(
            phoneNumber = "09402656594",
            password = "12345678",
            confirmPassword = "abcdefgh"
        )
        assertThat(result).isFalse()
    }
}