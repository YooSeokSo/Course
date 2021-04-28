package com.example.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {
    var fbFirestore : FirebaseFirestore? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fbFirestore = FirebaseFirestore.getInstance()

        if(true)
        {
            var stemps = ModelStemps()

            fbFirestore?.collection("stamp")?.document()?.set(stemps)
        }
    }


}