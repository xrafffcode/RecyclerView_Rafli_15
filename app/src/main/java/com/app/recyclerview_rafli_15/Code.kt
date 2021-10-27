package com.app.recyclerview_rafli_15

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class  Code(
    val imgCode: Int,
    val nameCode: String,
    val descCode: String,
) :Parcelable
