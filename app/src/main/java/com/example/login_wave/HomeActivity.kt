package com.example.login_wave

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //font task and change color by kotlin

        var fontText=ResourcesCompat.getFont(this,R.font.pacifico)
        homeText.typeface=fontText
        homeText.setTextColor(Color.parseColor("#0aad3f"))


        //array and loops(task)

        var arrayof= arrayOf("a","b","c","d","e","g","g","k")
        for (i in arrayof) println(i)


     //Animation(alpha(),rotation(),translationXBy().scale())

       homeText.animate().alpha(1f).duration=3000
        hello.animate().translationXBy(-1000f).duration=3000


    }
}