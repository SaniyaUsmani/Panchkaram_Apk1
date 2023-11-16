//package com.example.panchkaram
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//
//class OtpActivity : AppCompatActivity() {
//    private lateinit var otpEditText: EditText
//    private lateinit var verifyButton: Button
//
//    // Assume this is your OTP service for demonstration purposes
//    private val otpService = OTPService()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_otp)
//
//
//        otpEditText = findViewById(R.id.editTextNumberPassword2)
//        verifyButton = findViewById(R.id.button)
//
//        // Simulate sending OTP to the user (in a real app, this would be sent via SMS or another secure channel)
//        val generatedOTP = otpService.generateOTP()
//        showToast("OTP sent to the user: $generatedOTP")
//
//        verifyButton.setOnClickListener {
//            // Get the entered OTP from the EditText
//            val enteredOTP = otpEditText.text.toString().trim()
//
//            // Verify the entered OTP
//            if (otpService.verifyOTP(enteredOTP)) {
//                showToast("OTP Verified!")
//                // Continue with your logic after successful verification
//            } else {
//                showToast("Invalid OTP. Please try again.")
//            }
//        }
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
//}
//
//class OTPService {
//    fun generateOTP(): String {
//        return (100000..999999).random().toString()
//    }
//
//    fun verifyOTP(enteredOTP: String): Boolean {
//        // In a real app, compare the entered OTP with the expected value stored on the server or generated
//        // during the same session.
//        val expectedOTP ="1234"/* Get the expected OTP from the server or generated during the same session */;
//        return enteredOTP == 1234
//    }
//}
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

        // Simulate sending OTP to the user (in a real app, this would be sent via SMS or another secure channel)
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
                // Continue with your logic after successful verification
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
        // In a real app, compare the entered OTP with the expected value stored on the server or generated
        // during the same session.
        val expectedOTP = "1234" /* Get the expected OTP from the server or generated during the same session */
        return enteredOTP == expectedOTP
    }
}
