package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main_page.*

class MainPage : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        auth = FirebaseAuth.getInstance()

        btnLogOut.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, Login::class.java))
            finish()
        }

        btnMealOrdering.setOnClickListener{
            startActivity(Intent(this,MealOrdering::class.java))
            finish()
        }

        btnRating.setOnClickListener{
            startActivity(Intent(this,Rating::class.java))
            finish()
        }


    }
}
