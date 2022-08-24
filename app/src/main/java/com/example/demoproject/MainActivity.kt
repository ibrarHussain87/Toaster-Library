package com.example.demoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val myFlow = flow {
//            for (i in 1..100){
//                emit(i)
//                delay(1000)
//            }
//        }
//
//        CoroutineScope(Dispatchers.Main).launch{
//            myFlow.collect{
//                Log.i("MyTag","Tag from flow $it")
//            }
//        }
    }
}