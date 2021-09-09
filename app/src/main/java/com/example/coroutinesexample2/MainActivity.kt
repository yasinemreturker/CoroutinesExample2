package com.example.coroutinesexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch { Log.i("My tag","Hello from ${Thread.currentThread().name} at background thread")}

        CoroutineScope(Dispatchers.Main).launch { Log.i("My tag","Hello from ${Thread.currentThread().name} at main thread")}
    }
}