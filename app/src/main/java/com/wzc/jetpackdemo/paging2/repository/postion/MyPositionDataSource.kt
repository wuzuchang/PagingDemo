package com.wzc.jetpackdemo.paging2.repository.postion

import androidx.paging.PositionalDataSource
import com.wzc.jetpackdemo.paging2.bean.Cheese

class MyPositionDataSource: PositionalDataSource<Cheese>() {
    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Cheese>) {
    }

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Cheese>) {
        TODO("Not yet implemented")
    }

    fun loadData( ){

    }
}