package com.android.orc.kotlin_sqlite_recyclerview.model

/**
 * Created by j.poobest on 23/2/2018 AD.
 */

val DATABASE_VERSION: Int = 2
val DATABASE_NAME: String = "chore.db"
val TABLE_NAME: String = "chores"

// Chores table columns names
val KEY_ID: String = "id"
val KEY_CHORE_NAME: String = "chore_name"
val KEY_CHORE_ASSIGNED_BY: String = "chore_assigned_by"
val KEY_CHORE_ASSIGNED_TO: String = "chore_assigned_to"
val KEY_CHORE_ASSIGNED_TIME: String = "chore_assigned_time"
