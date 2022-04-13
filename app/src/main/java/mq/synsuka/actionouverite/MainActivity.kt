package mq.synsuka.actionouverite

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NO_ANIMATION
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import mq.synsuka.actionouverite.data.Questions
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init view ID
        val btnPlay = findViewById<Button>(R.id.v_main_btn)
        val animView = findViewById<View>(R.id.v_main_anim)
        val btnAnim = findViewById<View>(R.id.v_main_anime_btnSwitch)

        // function switch page
        fun goPage(){
            val intent = Intent(this, SelectActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnPlay.setOnClickListener {
            btnAnim.visibility = View.VISIBLE
            btnAnim.animate()
                .scaleX(40.0f)
                .scaleY(40.0f)
                .setDuration(500)
                .withEndAction {
                    goPage()
                }
                .start()
        }

        animView.animate()
            .scaleX(0.0f)
            .scaleY(0.0f)
            .setDuration(1000)
            .start()

    }
}