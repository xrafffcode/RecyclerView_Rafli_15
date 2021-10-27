package com.app.recyclerview_rafli_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val codeList = listOf<Code>(
            Code(
                R.drawable.reyna,
                    nameCode = "Reyna",
                    descCode = "Duelist"
            ),

            Code(
                R.drawable.omen,
                    nameCode = "Omen",
                    descCode = "Controller"
            ),

            Code(
                R.drawable.yoru,
                nameCode = "Yoru",
                descCode = "Duelist"
            ),

            Code(
                R.drawable.jet,
                nameCode = "Jett",
                descCode = "Duelist"
            ),

            Code(
                R.drawable.phoenix,
                nameCode = "Phoenix",
                descCode = "Duelist"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_code)
        val horizontalLayoutManagaer =
            LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CodeAdapter(this, codeList){
            val intent = Intent(this, DetailCodeActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}