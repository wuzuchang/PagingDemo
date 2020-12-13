package com.wzc.jetpackdemo.paging2.adapter

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.wzc.jetpackdemo.paging2.bean.Cheese

class Paging2Adapter : PagedListAdapter<Cheese, BaseViewHolder>(DIff_CALLBACK) {

    companion object {
        val DIff_CALLBACK = object : DiffUtil.ItemCallback<Cheese>() {
            override fun areContentsTheSame(oldItem: Cheese, newItem: Cheese): Boolean =
                oldItem.id == newItem.id

            override fun areItemsTheSame(oldItem: Cheese, newItem: Cheese): Boolean =
                oldItem.name == newItem.name
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(getItem(position), position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder.create(parent)
    }
}