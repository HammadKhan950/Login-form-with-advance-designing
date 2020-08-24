package com.hammadkhan950.login_form_with_rounded_textview

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var txtForgotPassword: TextView
    lateinit var txtSignUp: TextView
    lateinit var btnLogin: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        txtForgotPassword = findViewById(R.id.tvForgotPassword)
        txtSignUp = findViewById(R.id.tvSignUp)
        btnLogin = findViewById(R.id.btnLogin)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "  Log in Here"
        txtForgotPassword.paintFlags = txtForgotPassword.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        txtSignUp.paintFlags = txtSignUp.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()
            if (email.equals("hk") && password.equals("123")) {
                val intent = Intent(this, NewActivity::class.java)
                startActivity(intent)

            }
        }
    }
}