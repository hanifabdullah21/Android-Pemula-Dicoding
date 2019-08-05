package com.singpaulee.submission_android_pemula_dicoding.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DinosaurModel(
    var name: String? = null,
    var image: String? = null,
    var shortDescryption: String? = null,
    var quictFacts: String? = null
) : Parcelable