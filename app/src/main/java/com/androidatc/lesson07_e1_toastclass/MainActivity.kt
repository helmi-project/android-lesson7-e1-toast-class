package com.androidatc.lesson07_e1_toastclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClicked(view: View) {
        val toast = Toast.makeText(this,"Hello Android ATC",Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP,0,800)
        toast.show()
    }
}
