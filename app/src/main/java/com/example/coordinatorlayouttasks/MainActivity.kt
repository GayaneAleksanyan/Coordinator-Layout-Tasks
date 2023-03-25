package com.example.coordinatorlayouttasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_based)

        val click = findViewById<View>(R.id.fab)
        val contextView = findViewById<View>(R.id.layout_based_activity)
        val sb = Snackbar.make(contextView, "Hello!", Snackbar.LENGTH_SHORT)
        click.setOnClickListener {
            sb.show()
        }
    }

}