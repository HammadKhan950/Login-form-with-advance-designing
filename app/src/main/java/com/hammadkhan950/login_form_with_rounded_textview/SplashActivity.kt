package com.hammadkhan950.login_form_with_rounded_textview

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_login.*


class SplashActivity : AppCompatActivity() {

    lateinit var ivProfile : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        ivProfile=findViewById(R.id.ivProfile)
        Handler().postDelayed({
            val intent= Intent(this, LoginActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                ivProfile ,
                "imageTransition"
            )
            startActivity(intent)
        },2000)
    }
}