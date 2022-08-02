package com.task.data.dto.products
import com.google.gson.annotations.SerializedName

/**
 * Created by Mahmod Masoud on 8/1/2022.
 */
data class ProductResponse(
    @SerializedName("results")
    val productsItems: List<ProductsItem>
)