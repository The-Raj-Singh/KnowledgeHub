package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val callBtn = findViewById<Button>(R.id.callBtn)
        callBtn.setOnClickListener {
            call()
        }

    }

    private fun call() {
        val dialIntent = Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse("tel:" + "+919140201658"));
        startActivity(dialIntent);
    }
}