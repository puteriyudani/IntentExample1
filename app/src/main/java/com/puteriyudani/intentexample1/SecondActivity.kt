package com.puteriyudani.intentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {
    val Log = Logger.getLogger(SecondActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.info("onCreate")
        //button untuk menghentikan activity
        btnExitActivity.setOnClickListener {
            finish() //menggunakan fungsi finish()
        }
    }

    //info siklus aktivitas aplikasi
    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }
}