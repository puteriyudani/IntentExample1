package com.puteriyudani.intentexample1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    val Log = Logger.getLogger(MainActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.info("onCreate")
        //button untuk berpindah ke SecondActivity
        btnToSecondActivity.setOnClickListener {
            val m_intent = Intent(this@MainActivity,
                SecondActivity::class.java)
            startActivity(m_intent) //menggunakan fungsi startActivity
        }
    }

    //info siklus aktivitas aplikasi
    override fun onPause() {
        super.onPause()
        Log.info("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.info("onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.info("onResume")
    }
}