package com.klt.tdd

object RegistrationUtil {

    /**
     * validation will fail when
     * 1. phoneNumber, password , confirmPassword is empty
     * 2. password length less than 8
     * 3. confirmPassword is not the same as password
     */

    fun validate(
        phoneNumber: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (phoneNumber.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) return false
        if (password.count() < 8) return false
        if (password != confirmPassword) return false
        return true
    }
}