package com.example.projectakhir.room

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HomeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val deskripsi: String,
    val kamarTidur:String,
    val kamarMandi:String,
    val fasilitas1:String,
    val fasilitas2: String,
    val harga:String,
    val listrik:String,
    val image:String

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!

    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(deskripsi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HomeEntity> {
        override fun createFromParcel(parcel: Parcel): HomeEntity {
            return HomeEntity(parcel)
        }

        override fun newArray(size: Int): Array<HomeEntity?> {
            return arrayOfNulls(size)
        }
    }
}