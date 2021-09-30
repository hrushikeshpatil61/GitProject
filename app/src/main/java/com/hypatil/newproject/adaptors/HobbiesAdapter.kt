package com.hypatil.newproject.adaptors

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hypatil.newproject.Hobby
import com.hypatil.newproject.R
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context, val hobbies:List<Hobby>):RecyclerView.Adapter<HobbiesAdapter.myViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return myViewHolder(view)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby,position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }
    inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun setData(hobby: Hobby?, pos:Int) {
            itemView.tvTitle1.text=hobby!!.title;
        }

    }
}
