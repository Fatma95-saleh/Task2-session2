package com.example.login_wave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //login validation
        register.setOnClickListener {
            val intent = Intent(this, register_activity::class.java)
            startActivity(intent)
        }
        loginBtn.setOnClickListener {

            val phone = phoneField.text.toString()
            val pass = passwordField.text.toString()

            if (phone.isEmpty() && pass.isEmpty()) {
                textLogin.text = "Enter username and password please"
            }

            if (phone.length > 11 && phone.isNotEmpty()) {
                if (pass.isNotEmpty()) {
                    text_password.text = ""
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    text_number.text = ""
                } else {
                    text_password.text = "you should enter password"
                }
            } else {
                text_number.text = "You should Enter phone number with only 11 number"

            }


        }
    }
}