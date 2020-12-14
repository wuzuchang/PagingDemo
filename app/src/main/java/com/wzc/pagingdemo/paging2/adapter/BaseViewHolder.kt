package com.wzc.pagingdemo.paging2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wzc.pagingdemo.R
import com.wzc.pagingdemo.paging2.bean.Cheese

class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val mItemContentTv: TextView = itemView.findViewById(R.id.item_content)

    companion object {
        fun create(parent: ViewGroup): BaseViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item, parent, false)
            return BaseViewHolder(view)
        }
    }

    fun bind(cheese: Cheese?, position: Int) {
        mItemContentTv.text = "id=${cheese?.id},name=${cheese?.name},position=$position"
    }


}