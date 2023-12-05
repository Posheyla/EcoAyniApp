package com.ecoayni.ecoayniapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import com.ecoayni.ecoayniapp.R
import com.ecoayni.ecoayniapp.ui.trayectory.TrayectoryUpdateActivity

class RecyclingDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycling_dashboard)
        val buttonSend =findViewById<Button>(R.id.button_send)
        buttonSend.setOnClickListener{navigateToTrayectoryUpdateApp()}
    }

    private fun navigateToTrayectoryUpdateApp() {
        val intent = Intent(this, TrayectoryUpdateActivity::class.java)
        startActivity(intent)
    }
}