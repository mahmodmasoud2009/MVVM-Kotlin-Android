package com.task.data.dto.products
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


/**
 * Created by Mahmod Masoud on 7/31/2022.
 */

@Parcelize
data class ProductsItem(
    @SerializedName("created_at")
    val createdAt: String = "",
    @SerializedName("price")
    val price: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("uid")
    val uid: String = "",
    @SerializedName("image_ids")
    val image_ids: List<String> = listOf(),
    @SerializedName("image_urls")
    val image_urls: List<String> = listOf(),
    @SerializedName("image_urls_thumbnails")
    val image_urls_thumbnails: List<String> = listOf(),
):Parcelable
