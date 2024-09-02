package com.example.loginscreen

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val login = findViewById<Button>(R.id.login)

        login.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            val correctEmail = "nikena608@gmail.com"
            val correctPassword = "123456"

            if (email == correctEmail && password == correctPassword) {

                val intent = Intent(this, Welcome::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Username or Password is incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}