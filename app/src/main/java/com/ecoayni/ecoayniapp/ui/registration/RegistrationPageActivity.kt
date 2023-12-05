package com.ecoayni.ecoayniapp.ui.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ecoayni.ecoayniapp.R

class RegistrationPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_page)
        val buttonRegister =findViewById<Button>(R.id.button_register_second)
        buttonRegister.setOnClickListener{navigateToQuestionnaireApp()}
    }

    private fun navigateToQuestionnaireApp() {
        val intent = Intent(this, QuestionnairePageActivity::class.java)
        startActivity(intent)
    }


}