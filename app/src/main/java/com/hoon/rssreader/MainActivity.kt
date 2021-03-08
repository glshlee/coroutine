package com.hoon.rssreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext

class MainActivity : AppCompatActivity() {

    private val netDispatcher = newSingleThreadContext(name = "ServiceCall")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(netDispatcher) {
            // TODO Call coroutine here
        }
    }
}