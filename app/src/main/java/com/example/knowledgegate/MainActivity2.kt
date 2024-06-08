package com.example.knowledgegate

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val appDev = findViewById<CardView>(R.id.appdev)
        val iosDev = findViewById<CardView>(R.id.ios)
        val machineLearning =findViewById<CardView>(R.id.ml)
        val webDev = findViewById<CardView>(R.id.wd)
        val contactUs = findViewById<CardView>(R.id.contact)


       appDev.setOnClickListener {
           val intent = Intent(Intent.ACTION_VIEW)
           intent.data = Uri.parse("https://developer.android.com/about")
           startActivity(intent)
       }

        iosDev.setOnClickListener {
          val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.apple.com/")
            startActivity(intent)
        }

        machineLearning.setOnClickListener {
          val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/steps-to-build-a-machine-learning-model/")
            startActivity(intent)

        }

        webDev.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://web.dev/learn/")
            startActivity(intent)

        }

        contactUs.setOnClickListener {
         val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:180030000123")
            startActivity(intent)
        }
    }
}