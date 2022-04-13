package mq.synsuka.actionouverite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mq.synsuka.actionouverite.adapters.AdapterUser
import mq.synsuka.actionouverite.data.User

class SelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        //init val id
        val textDebug = findViewById<TextView>(R.id.v_select_textdebud)
        val btnAddUser = findViewById<Button>(R.id.v_select_btnAdduser)
        val radioMal = findViewById<RadioButton>(R.id.v_select_radionBtnH)
        val radioFem = findViewById<RadioButton>(R.id.v_select_radionBtnF)
        val errorText = findViewById<TextView>(R.id.v_select_errorText)
        val inputAddUser = findViewById<EditText>(R.id.v_select_inputFormUser)
        val btnNextView = findViewById<Button>(R.id.v_select_btnGoNextPage)
        val recyclerViewListe = findViewById<RecyclerView>(R.id.v_select_listeRecycler)
        val inputAnim = findViewById<View>(R.id.v_select_anim_input)

        // init var and val
        var stateTypeUser: Boolean? = null
        var userId = 0
        val users = arrayListOf<User>()
        var adapter: AdapterUser

        // init recyclerView
        recyclerViewListe.layoutManager = LinearLayoutManager(this)
        adapter = AdapterUser(users)
        recyclerViewListe.adapter = adapter

        // functions debugs
        fun debugTests(){
            textDebug.text = "size table users = ${users.size}"
        }

        fun isOkForm(): Boolean{
            var isOk = true
            if(stateTypeUser == null){
                isOk = false
                errorText.text = "Selectionnez le sex"
                errorText.visibility = View.VISIBLE
            }
            if (inputAddUser.text.toString().trim().isEmpty()){
                isOk = false
                errorText.text = "Ecrire un nom"
                errorText.visibility = View.VISIBLE
            }
            return isOk
        }

        fun btnNextActive(){
            if(users.size < 2){
                btnNextView.isEnabled = false
            }else{
                btnNextView.isEnabled = true
            }
        }

        // event click radio
        radioMal.setOnClickListener {
            stateTypeUser = true
            errorText.visibility = View.GONE
            debugTests()
        }

        // event click radio
        radioFem.setOnClickListener {
            stateTypeUser = false
            errorText.visibility = View.GONE
            debugTests()
        }

        //event change input user
        inputAddUser.addTextChangedListener {
            errorText.visibility = View.GONE
        }

        // event click btn add user
        btnAddUser.setOnClickListener {
            if (isOkForm()){
                val textinputPlayer = inputAddUser.text.toString().trim()
                inputAnim.visibility = View.VISIBLE
                inputAddUser.text.clear()
                inputAnim.animate()
                    .scaleX(0.1f)
                    .setDuration(250)
                    .withEndAction {
                        inputAnim.animate()
                            .translationY(500f)
                            .alpha(0f)
                            .setDuration(250)
                            .withEndAction {

                                //add user list
                                users.add(User(userId, textinputPlayer, stateTypeUser!!))
                                userId ++
                                btnNextActive()
                                adapter.notifyDataSetChanged()

                                //resetanim
                                inputAnim.visibility = View.GONE
                                inputAnim.animate()
                                    .translationY(0f)
                                    .scaleX(1f)
                                    .alpha(1f)
                                    .setDuration(0)
                                    .start()
                            }
                            .start()
                    }
                    .start()

            }
            debugTests()
        }

        //event liste change
        recyclerViewListe.setRecyclerListener {
            btnNextActive()
        }

        //event click btn next
        btnNextView.setOnClickListener {
            Intent(this, GameActivity::class.java).also {
                it.putExtra("tabUser", users)
                startActivity(it)
            }
        }

    }

}