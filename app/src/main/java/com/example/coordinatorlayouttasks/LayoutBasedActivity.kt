package com.example.coordinatorlayouttasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LayoutBasedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_based)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}