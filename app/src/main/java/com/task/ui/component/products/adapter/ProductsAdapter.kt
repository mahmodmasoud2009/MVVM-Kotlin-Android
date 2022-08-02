package com.task.ui.component.products.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.task.data.dto.products.ProductsItem
import com.task.databinding.RecipeItemBinding
import com.task.ui.base.listeners.RecyclerItemListener
import com.task.ui.component.products.ProductsListViewModel

/**
 * Created by Mahmod Masoud on 7/31/2022.
 */


class ProductsAdapter(private val recipesListViewModel: ProductsListViewModel, private val products: List<ProductsItem>) : RecyclerView.Adapter<ProductViewHolder>() {

    private val onItemClickListener: RecyclerItemListener = object : RecyclerItemListener {
        override fun onItemSelected(product: ProductsItem) {
            recipesListViewModel.openProductsDetails(product)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemBinding = RecipeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position], onItemClickListener)
    }

    override fun getItemCount(): Int {
        return products.size
    }
}

