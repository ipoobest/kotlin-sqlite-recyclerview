package com.android.orc.kotlin_sqlite_recyclerview.viewholer

import android.content.Context
import android.support.v7.app.AlertDialog
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.android.orc.kotlin_sqlite_recyclerview.R
import com.android.orc.kotlin_sqlite_recyclerview.data.ChoresDatabaseHandler
import com.android.orc.kotlin_sqlite_recyclerview.model.Chore

/**
 * Created by j.poobest on 23/2/2018 AD.
 */
class ChoreHolder(itemView: View?, context: Context, list: ArrayList<Chore>) : RecyclerView.ViewHolder(itemView), View.OnClickListener {


    var mContext = context
    var mList = list

    var choreName = itemView?.findViewById<TextView>(R.id.listChoreName) as TextView
    var assignedBy = itemView?.findViewById<TextView>(R.id.listAssignedBy) as TextView
    var assignedDate = itemView?.findViewById<TextView>(R.id.listDate) as TextView
    var assignedTo = itemView?.findViewById<TextView>(R.id.listAssignedTo) as TextView

    var deleteButton = itemView?.findViewById<Button>(R.id.listDeleteButton) as Button
    var editButton = itemView?.findViewById<Button>(R.id.listEditButton) as Button


    fun bindViews(chore: Chore) {

        choreName.text = chore.choreName
        assignedBy.text = chore.assignedBy
        assignedDate.text = chore.showHumanDate(System.currentTimeMillis())
        assignedTo.text = chore.assignedTo

        deleteButton.setOnClickListener(this)
        editButton.setOnClickListener(this)

    }


    override fun onClick(v: View?) {

    }

    fun deleteChore(id: Int) {

        var db: ChoresDatabaseHandler = ChoresDatabaseHandler(mContext)
        db.deleteChore(id)

    }

    fun editChore(chore: Chore) {


    }


}