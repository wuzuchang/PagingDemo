package com.wzc.pagingdemo.paging2.repository.page

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.wzc.pagingdemo.paging2.bean.Cheese
import com.wzc.pagingdemo.paging2.printThreadInfo

class ByPageRepository {
    private val mFactory = object : DataSource.Factory<Int, Cheese>() {
        override fun create(): DataSource<Int, Cheese> {
            return MyPageDataSource()
        }
    }

    fun getLivePageList(): LiveData<PagedList<Cheese>> {
        val pagedListConfig = PagedList.Config.Builder().setPageSize(10)
            .setPrefetchDistance(5)
            .setEnablePlaceholders(true)
            .setInitialLoadSizeHint(40)
            .setMaxSize(100)
            .build()
        return LivePagedListBuilder(mFactory, pagedListConfig)
            .setBoundaryCallback(mBoundaryCallback)
            .build()
    }

    private val mBoundaryCallback = object : PagedList.BoundaryCallback<Cheese>() {

        override fun onItemAtEndLoaded(itemAtEnd: Cheese) {
            super.onItemAtEndLoaded(itemAtEnd)
            printThreadInfo("onItemAtEndLoaded()")
        }

        override fun onItemAtFrontLoaded(itemAtFront: Cheese) {
            super.onItemAtFrontLoaded(itemAtFront)
            printThreadInfo("onItemAtFrontLoaded()")
        }

        override fun onZeroItemsLoaded() {
            super.onZeroItemsLoaded()
            printThreadInfo("onZeroItemsLoaded()")
        }
    }
}