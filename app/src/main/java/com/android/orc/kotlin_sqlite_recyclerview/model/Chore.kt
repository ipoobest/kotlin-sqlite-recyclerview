package com.android.orc.kotlin_sqlite_recyclerview.model

import java.text.DateFormat
import java.util.*

/**
 * Created by j.poobest on 23/2/2018 AD.
 */
class Chore {
    var choreName: String? = null
    var assignedBy: String? = null
    var assignedTo: String? = null
    var timeAssigned: Long? = null
    var id: Int? = null

    constructor(choreName: String, assignedBy: String,
                assignedTo: String, timeAssigned: Long,
                id: Int) : this() {

        this.choreName = choreName
        this.assignedBy = assignedBy
        this.assignedTo = assignedTo
        this.timeAssigned = timeAssigned
        this.id = id

    }

    constructor()


    fun showHumanDate(timeAssigned: Long): String {

        var dateFormat: java.text.DateFormat = DateFormat.getDateInstance()
        var formattedDate: String = dateFormat.format(Date(timeAssigned).time)

        return "Created: ${formattedDate}"

    }

    override fun toString(): String {
        return "Chore(choreName=$choreName, assignedBy=$assignedBy, assignedTo=$assignedTo, timeAssigned=$timeAssigned, id=$id)"
    }

}