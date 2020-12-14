package com.wzc.pagingdemo.paging2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wzc.pagingdemo.R

class Paging2Activity : AppCompatActivity() {

    private val mDbOnlyWithPosition: Button by lazy { findViewById<Button>(R.id.dbOnlyWithPosition) }
    private val mDbOnlyWithItem: Button by lazy { findViewById<Button>(R.id.dbOnlyWithItem) }
    private val mDbOnlyWithPage: Button by lazy { findViewById<Button>(R.id.dbOnlyWithPage) }
    private val mDbAndNetwork: Button by lazy { findViewById<Button>(R.id.dbAndNetwork) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paging2)
        mDbOnlyWithPosition.setOnClickListener {
            startActivity(Intent(this, PositionActivity::class.java))
        }
        mDbOnlyWithItem.setOnClickListener {
            startActivity(Intent(this, ItemKeyActivity::class.java))
        }
        mDbOnlyWithPage.setOnClickListener {
            startActivity(Intent(this, PageKeyActivity::class.java))
        }
        mDbAndNetwork.setOnClickListener {
            startActivity(Intent(this, DbAndNetworkActivity::class.java))
        }
    }
}