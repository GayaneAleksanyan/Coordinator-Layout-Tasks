package com.example.coordinatorlayouttasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ScrollBasedActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_based)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}