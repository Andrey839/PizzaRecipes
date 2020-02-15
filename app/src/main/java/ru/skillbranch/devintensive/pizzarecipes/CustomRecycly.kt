package ru.skillbranch.devintensive.pizzarecipes

import android.icu.util.ULocale
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_pizza.view.*


class CustomRecycly(val userList: ArrayList<Object>, val onClickListen : (Int)-> Unit) :
    RecyclerView.Adapter<CustomRecycly.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_pizza, parent, false)
        val viewHolder= ViewHolder(v)
        v.setOnClickListener { onClickListen.invoke(viewHolder.adapterPosition) }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user: Object) {
            val picterView = itemView.ImageView
            val textViewPizza = itemView.textView
            val textViewRecipes = itemView.textView2
            picterView.setImageResource(user.picture)
            textViewPizza.text = user.pizza
            textViewRecipes.text = user.recipes


        }
    }
}