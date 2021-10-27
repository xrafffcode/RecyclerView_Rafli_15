package com.app.recyclerview_rafli_15

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class  CodeAdapter (private val context: Context, private val code: List<Code>, val listener: (Code) -> Unit)
    : RecyclerView.Adapter<CodeAdapter.CodeViewHolder>(){

    class CodeViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgCode = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameCode = view.findViewById<TextView>(R.id.tv_item_name)
        val descCode = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(code: Code, listener: (Code) -> Unit) {
            imgCode.setImageResource(code.imgCode)
            nameCode.text = code.nameCode
            descCode.text = code.descCode
            itemView.setOnClickListener{
                listener(code)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CodeViewHolder {
        return CodeViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_code, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CodeViewHolder, position: Int) {
      holder.bindView(code[position], listener)
    }

    override fun getItemCount(): Int = code.size
    }
