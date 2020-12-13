package com.wzc.jetpackdemo.paging2.repository.item

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.wzc.jetpackdemo.paging2.bean.Cheese

class ByItemRepository {

    private val mFactory = object : DataSource.Factory<Int, Cheese>() {
        override fun create(): DataSource<Int, Cheese> {
            return MyItemDataSource()
        }
    }

    fun getLivePageList(): LiveData<PagedList<Cheese>> {
        val pagedListConfig = PagedList.Config.Builder().setPageSize(10)
            .setPrefetchDistance(5)
            .setEnablePlaceholders(true)
            .setInitialLoadSizeHint(30)
            .setMaxSize(100)
            .build()
        return LivePagedListBuilder(mFactory, pagedListConfig).build()
    }
}