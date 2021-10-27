package com.app.recyclerview_rafli_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_code)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val code = intent.getParcelableExtra<Code>(MainActivity.INTENT_PARCELABLE)

        val imgCode = findViewById<ImageView>(R.id.img_item_photo)
        val nameCode = findViewById<TextView>(R.id.tv_item_name)
        val descCode = findViewById<TextView>(R.id.tv_item_description)

        imgCode.setImageResource(code?.imgCode!!)
        nameCode.text = code.nameCode
        descCode.text = code.descCode

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}