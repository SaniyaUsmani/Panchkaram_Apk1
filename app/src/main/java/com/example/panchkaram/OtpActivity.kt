
package com.example.panchkaram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OtpActivity : AppCompatActivity() {

    private lateinit var otpEditText: EditText
    private lateinit var verifyButton: Button
    private val otpService = OTPService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        otpEditText = findViewById(R.id.editTextNumberPassword2)
        verifyButton = findViewById(R.id.button)


        val generatedOTP = otpService.generateOTP()
        showToast("OTP sent to the user: $generatedOTP")

        verifyButton.setOnClickListener {
            // Get the entered OTP from the EditText
            val enteredOTP = otpEditText.text.toString().trim()

            // Verify the entered OTP
            if (otpService.verifyOTP(enteredOTP)) {
                showToast("OTP Verified!")
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                showToast("Invalid OTP. Please try again.")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

class OTPService {
    fun generateOTP(): String {
        return (100000..999999).random().toString()
    }

    fun verifyOTP(enteredOTP: String): Boolean {

        val expectedOTP = "1234"
        return enteredOTP == expectedOTP
    }
}
