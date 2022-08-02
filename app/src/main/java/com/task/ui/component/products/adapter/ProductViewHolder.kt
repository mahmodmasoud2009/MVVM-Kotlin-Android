package com.task.ui.component.products.adapter

import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.task.R
import com.task.data.dto.products.ProductsItem
import com.task.databinding.RecipeItemBinding
import com.task.ui.base.listeners.RecyclerItemListener

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */


class ProductViewHolder(private val itemBinding: RecipeItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(productItem: ProductsItem, recyclerItemListener: RecyclerItemListener) {
        itemBinding.tvCaption.text = productItem.name
        itemBinding.tvName.text = productItem.name
        Picasso.get().load(productItem.image_urls_thumbnails[0]).placeholder(R.drawable.ic_healthy_food).error(R.drawable.ic_healthy_food).into(itemBinding.ivRecipeItemImage)
        itemBinding.rlRecipeItem.setOnClickListener { recyclerItemListener.onItemSelected(productItem) }
    }
}

