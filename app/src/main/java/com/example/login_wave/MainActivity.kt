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
            
             val passwordREGEX = Pattern.compile("^" +
                    "(?=.*[0-9])" +         //at least 1 digit
                    "(?=.*[a-z])" +         //at least 1 lower case letter
                    "(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{8,}" +               //at least 8 characters
                    "$")

            if (phone.isEmpty() && pass.isEmpty()) {
                textLogin.text = "Enter username and password please"
            }

            if (phone.length > 11 && phone.isNotEmpty()) {
                if (pass.isNotEmpty()&&passwordREGEX.matcher(pass).matches()) {
                    text_password.text = ""
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    text_number.text = ""
                } else {
                     text_password.text = "password is to weak"
                }
            } else {
                text_number.text = "You should Enter phone number with only 11 number"

            }


        }
    }
}
