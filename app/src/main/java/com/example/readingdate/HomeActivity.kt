package com.example.readingdate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var tvHome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var intentStarted = intent;
        var extras = intentStarted.extras
        var data = extras?.getString("harmankey")
        tvHome = findViewById(R.id.tvHome)
        tvHome.text = data
       /* var venkat = Student("Santhosh",123,true)
        venkat.name="Santhosh"
        var emp = Employee("Santhosh",123,false)*/
    }
    fun clickHandler(view: View) {
        var hIntent = Intent(this, MainActivity::class.java)
        startActivity(hIntent)
    }
}