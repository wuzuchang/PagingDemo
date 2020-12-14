package com.wzc.pagingdemo.paging2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wzc.pagingdemo.R
import com.wzc.pagingdemo.paging2.adapter.Paging2Adapter
import com.wzc.pagingdemo.paging2.repository.page.ByPageRepository

class PageKeyActivity : AppCompatActivity() {

    private val mItemRecyclerView: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.recyclerview)
    }
    private var mAdapter: Paging2Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_key)

        mAdapter = Paging2Adapter()
        mItemRecyclerView.adapter = mAdapter
        mItemRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        ByPageRepository().getLivePageList().observe(this, Observer {
            mAdapter?.submitList(it)
        })
    }
}