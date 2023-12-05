package com.ecoayni.ecoayniapp.ui.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ecoayni.ecoayniapp.R
import com.ecoayni.ecoayniapp.databinding.ActivityMainBinding
import com.ecoayni.ecoayniapp.ui.home.RecyclingDashboardActivity
import com.ecoayni.ecoayniapp.ui.password.RestorePageActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_main)
        val buttonLogin =findViewById<Button>(R.id.button_login)
        val buttonRegister =findViewById<Button>(R.id.button_register)
        val buttonRestore = findViewById<Button>(R.id.button_restore)
        buttonLogin.setOnClickListener{navigateToLoginApp()}
        buttonRegister.setOnClickListener{navigateToRegisterApp()}
        buttonRestore.setOnClickListener{navigateToRestoreApp()}
    }

    private fun navigateToRestoreApp() {
        val intent = Intent(this, RestorePageActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToRegisterApp() {
        val intent = Intent(this, RegistrationPageActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToLoginApp() {
        val intent = Intent(this, RecyclingDashboardActivity::class.java)
        startActivity(intent)
    }
}