package com.task.ui.base.listeners

import com.task.data.dto.products.ProductsItem


/**
 * Created by Mahmod Masoud on 7/31/2022.
 */

interface RecyclerItemListener {
    fun onItemSelected(product : ProductsItem)
}
