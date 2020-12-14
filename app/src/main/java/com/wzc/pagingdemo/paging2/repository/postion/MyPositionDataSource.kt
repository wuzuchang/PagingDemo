package com.wzc.pagingdemo.paging2.repository.postion

import androidx.paging.PositionalDataSource
import com.wzc.pagingdemo.paging2.bean.Cheese
import com.wzc.pagingdemo.paging2.loadData
import com.wzc.pagingdemo.paging2.log
import com.wzc.pagingdemo.paging2.printThreadInfo

class MyPositionDataSource : PositionalDataSource<Cheese>() {
    override fun loadInitial(params: LoadInitialParams, callback: LoadInitialCallback<Cheese>) {
        log("loadInitial() params.requestedStartPosition=${params.requestedStartPosition}, params.requestedLoadSize=${params.requestedLoadSize}, params.pageSize=${params.pageSize}, params.placeholdersEnabled=${params.placeholdersEnabled}")
        printThreadInfo("loadInitial()")
        callback.onResult(
            data = loadData(params.requestedStartPosition, params.pageSize),
            position = 0,
            totalCount = 400
        )
    }

    override fun loadRange(params: LoadRangeParams, callback: LoadRangeCallback<Cheese>) {
        log("loadRange() params.requestedStartPosition=${params.startPosition}, params.requestedLoadSize=${params.loadSize}")
        printThreadInfo("loadRange()")
        callback.onResult(
            data = loadData(params.startPosition, params.loadSize)
        )
    }

}