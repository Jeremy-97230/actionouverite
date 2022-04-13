package mq.synsuka.actionouverite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.gson.Gson
import mq.synsuka.actionouverite.data.QuestionFormat
import mq.synsuka.actionouverite.data.Questions
import mq.synsuka.actionouverite.data.User
import kotlin.random.Random

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        //init val id
        val nameTile = findViewById<TextView>(R.id.v_game_NameTitle)
        val viewBtn = findViewById<LinearLayout>(R.id.v_game_ViewBtn)
        val viewQuestion = findViewById<LinearLayout>(R.id.v_game_ViewQuestions)
        val btnAction = findViewById<Button>(R.id.v_game_btnAct)
        val btnVerite = findViewById<Button>(R.id.v_game_btnVer)
        val titleQuestion = findViewById<TextView>(R.id.v_game_textQuestion)
        val btnNext = findViewById<TextView>(R.id.v_game_btnNext)

        // init var and val
        var numberRandomQt = 0
        val tabUsers : ArrayList<User> = intent.getParcelableArrayListExtra("tabUser")!!
        val realTabAction = ArrayList<User>(tabUsers)
        var isMode = true
        var maxAction = 0
        var maxVerite = 0


        // function get random no repet
        fun getRandom(chiffre: Int):Int{
                return Random.nextInt(0, chiffre )
        }

        // function question manage now user
        fun tabActionUserLoader(numberRandomUsr: Int){
            realTabAction.removeAt(numberRandomUsr)
            if (realTabAction.size < 1){
                realTabAction.addAll(tabUsers)
            }
        }

        // display function question
        fun showNextQuextion(){
            val typeQuestion: ArrayList<QuestionFormat>
            if (isMode){
                typeQuestion = Questions.getActions()
            }else{
                typeQuestion = Questions.getVerites()
            }
            var number = getRandom(typeQuestion.size)

            while (numberRandomQt == number){
                number = getRandom(typeQuestion.size)
            }
            numberRandomQt = number
            titleQuestion.text = typeQuestion[numberRandomQt].question
        }

        // display function user
        fun showNextUser(){
            val number = getRandom(realTabAction.size)
            nameTile.text = realTabAction[number].name
            tabActionUserLoader(number)
        }

        //function change mode to question
        fun moveToQuestionView(){
            showNextQuextion()
            viewBtn.visibility = View.GONE
            viewQuestion.visibility = View.VISIBLE


            btnAction.visibility = View.VISIBLE
            btnVerite.visibility = View.VISIBLE
            if (maxAction > 2){
                btnAction.visibility = View.GONE
            }

            if (maxVerite > 2){
                btnVerite.visibility = View.GONE
            }

        }

        //function change mode to question
        fun moveToBtnView(){
            showNextUser()
            viewQuestion.visibility = View.GONE
            viewBtn.visibility = View.VISIBLE
        }

        // Load effect
        showNextUser()

        // event btn next question
        btnNext.setOnClickListener{
            moveToBtnView()
        }

        // event btn action
        btnAction.setOnClickListener {
            isMode = true
            maxAction ++
            maxVerite = 0
            moveToQuestionView()
        }

        // event btn action
        btnVerite.setOnClickListener {
            isMode = false
            maxVerite ++
            maxAction = 0
            moveToQuestionView()
        }

    }
}