package com.example.abdallahsarayrah.radiobtnh

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun select(v: View) {
        if (rd_red.isChecked) main.setBackgroundColor(Color.parseColor("#FF0000"))
        if (rd_green.isChecked) main.setBackgroundColor(Color.parseColor("#4ECD27"))
        if (rd_blue.isChecked) main.setBackgroundColor(Color.parseColor("#2737CD"))
    }
}
