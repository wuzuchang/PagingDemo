package com.wzc.jetpackdemo.paging2.repository.item

import android.util.Log
import androidx.paging.ItemKeyedDataSource
import com.wzc.jetpackdemo.paging2.bean.Cheese
import com.wzc.jetpackdemo.paging2.loadData

class MyItemDataSource : ItemKeyedDataSource<Int, Cheese>() {
    override fun getKey(item: Cheese): Int {
        return item.id
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Cheese>) {
        Log.d("wzc==","loadAfter() Thread.name=${Thread.currentThread().name}, Thread.id=${Thread.currentThread().id}," )
        Log.d("wzc==","loadAfter() params.key=${params.key}, params.requestedLoadSize=${params.requestedLoadSize}" )
        callback.onResult(loadData(params.key, params.requestedLoadSize))
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Cheese>) {
    }

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Cheese>
    ) {
        Log.d("wzc==","loadInitial() Thread.name=${Thread.currentThread().name}, Thread.id=${Thread.currentThread().id}" )
        Log.d("wzc==","loadInitial() params.requestedInitialKey=${params.requestedInitialKey}, params.requestedLoadSize=${params.requestedLoadSize}" )
        val data = loadData(0, params.requestedLoadSize)
        callback.onResult(data)
    }
}