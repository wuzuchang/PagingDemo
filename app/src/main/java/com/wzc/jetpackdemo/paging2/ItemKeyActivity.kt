package com.wzc.jetpackdemo.paging2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wzc.jetpackdemo.R
import com.wzc.jetpackdemo.paging2.adapter.Paging2Adapter
import com.wzc.jetpackdemo.paging2.repository.item.ByItemRepository


class ItemKeyActivity : AppCompatActivity() {

    private val mItemRecyclerView: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.recyclerview)
    }
    private var mAdapter: Paging2Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_key)

        mAdapter = Paging2Adapter()

        mItemRecyclerView.adapter = mAdapter
        mItemRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        ByItemRepository().getLivePageList().observe(this, Observer {
            mAdapter?.submitList(it)
        })

    }
}