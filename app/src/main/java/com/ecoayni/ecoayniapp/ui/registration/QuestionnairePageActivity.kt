package com.ecoayni.ecoayniapp.ui.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.ecoayni.ecoayniapp.R
import com.ecoayni.ecoayniapp.ui.home.RecyclingDashboardActivity

class QuestionnairePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnaire_page)
        val buttonSent =findViewById<Button>(R.id.button_send)
        buttonSent.setOnClickListener{navigateToRecyclingDashboardApp()}
    }

    private fun navigateToRecyclingDashboardApp() {
        val intent = Intent(this, RecyclingDashboardActivity::class.java)
        startActivity(intent)
    }
}