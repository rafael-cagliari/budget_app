package com.rafael.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigDecimal
import java.util.*


@Entity(tableName = "items_table")
data class Item (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var value:BigDecimal,
    var description:String,
    var date:Date,
    var status: Boolean,
    var type:String
)