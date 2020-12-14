package com.wzc.pagingdemo.paging3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wzc.pagingdemo.R
import com.wzc.pagingdemo.paging2.DbAndNetworkActivity
import com.wzc.pagingdemo.paging2.PageKeyActivity

class Paging3Activity : AppCompatActivity() {

    private val mDbOnly: Button by lazy { findViewById<Button>(R.id.dbOnly) }
    private val mDbAndNetwork: Button by lazy { findViewById<Button>(R.id.dbAndNetwork) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paging3)

        mDbOnly.setOnClickListener {
            startActivity(Intent(this, PageKeyActivity::class.java))
        }
        mDbAndNetwork.setOnClickListener {
            startActivity(Intent(this, DbAndNetworkActivity::class.java))
        }
    }
}