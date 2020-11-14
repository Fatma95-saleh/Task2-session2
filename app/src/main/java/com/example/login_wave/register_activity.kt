package com.example.login_wave

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register_activity.*

class register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activity)

        button.setOnClickListener {
            val fullName=fullName.text.toString()
            val userName=userName.text.toString()
            val email=email.text.toString()
            val password=password.text.toString()
            val confirmPassword=confirmPassword.text.toString()
            var textMessage=message.text.toString()
           // var userNameMessage=nameMessage.text.toString()
           // var textUserName=textUserName.text.toString()
           // var textEmail=textEmail.text.toString()
            var textPassword=textpassword.text.toString()
            var textNotIdentical=notIdentical.text.toString()



            if(fullName.isNotEmpty()&&userName.isNotEmpty()&&email.isNotEmpty()&&password.isNotEmpty()&&confirmPassword.isNotEmpty()&&password == confirmPassword){

                 var intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)

            }
            else{
                message.text="Enter All Information Please To Complete Register"
            }


             if(fullName.isNotEmpty()){

                 if(userName.isNotEmpty()){

                     if(email.isNotEmpty()){
                         if(password.isNotEmpty()){

                             if(password != confirmPassword) {
                                 notIdentical.text = "Password is not identicall"

                             }

                         }else{

                             textpassword.text="Enter Password please"
                         }


                     }else{
                         textEmail.text="Enter Email Please"
                     }

                 }else{

                     textUserName.text="Enter User Name Please"
                 }

             }else{

                 nameMessage.text="Enter Full Name Please"

             }
        }
    }
}