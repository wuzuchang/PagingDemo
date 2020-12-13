package com.wzc.jetpackdemo.paging2.repository.page

import androidx.paging.PageKeyedDataSource
import com.wzc.jetpackdemo.paging2.bean.Cheese

class MyPageDataSource:PageKeyedDataSource<Int, Cheese>() {
    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Cheese>) {
        TODO("Not yet implemented")
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Cheese>) {
        TODO("Not yet implemented")
    }

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Cheese>
    ) {
        TODO("Not yet implemented")
    }
}