package com.example.shubhamkmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shubhamkmart.model.RecviewVerticalModel

class MainActivity : AppCompatActivity() {

    val catList:ArrayList<RecviewVerticalModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}