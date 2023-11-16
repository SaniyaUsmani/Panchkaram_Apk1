package com.example.panchkaram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


                val mobileNumberEditText: EditText = findViewById(R.id.mobileNumberEditText)
                val loginButton: Button = findViewById(R.id.button4)

                loginButton.setOnClickListener {
                    // Get the entered mobile number
                    val mobileNumber = mobileNumberEditText.text.toString().trim()
                    if (isValidMobileNumber(mobileNumber)) {
                        val intent = Intent(this, OtpActivity::class.java)
                        startActivity(intent)
                    } else {
                        print("Please enter a valid mobile number")
                    }
                }
            }

            private fun isValidMobileNumber(mobileNumber: String): Boolean {
                return mobileNumber.length == 10
            }

            private fun showToast(message: String) {
                // Replace this with your preferred way of displaying messages to the user
                // It could be a Toast, Snackbar, or any other UI element
                // For simplicity, we are using Toast in this example
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            }
        }

//    }
//}