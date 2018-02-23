package com.android.orc.kotlin_sqlite_recyclerview.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.orc.kotlin_sqlite_recyclerview.R
import com.android.orc.kotlin_sqlite_recyclerview.model.Chore
import com.android.orc.kotlin_sqlite_recyclerview.viewholer.ChoreHolder

/**
 * Created by j.poobest on 23/2/2018 AD.
 */
class ChorelistAdapter(private val context: Context, private val list: ArrayList<Chore>) :
        RecyclerView.Adapter<ChoreHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ChoreHolder {
        //create our view from our xml file
        val view = LayoutInflater.from(context)
                .inflate(R.layout.list_item, parent, false)



        return ChoreHolder(view, context,list)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ChoreHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}