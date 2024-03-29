package io.julius.alcandroidchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonProfile.setOnClickListener { startActivity(Intent(this, ProfileActivity::class.java)) }
        buttonAboutALC.setOnClickListener { startActivity(Intent(this, AlcActivity::class.java)) }
    }
}
