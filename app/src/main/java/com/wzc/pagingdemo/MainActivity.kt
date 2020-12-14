package com.wzc.pagingdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wzc.pagingdemo.paging2.Paging2Activity
import com.wzc.pagingdemo.paging3.Paging3Activity

class MainActivity : AppCompatActivity() {

    private val mPaging2: Button by lazy { findViewById<Button>(R.id.open_paging2) }
    private val mPaging3: Button by lazy { findViewById<Button>(R.id.open_paging3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPaging2.setOnClickListener {
            startActivity(Intent(this, Paging2Activity::class.java))
        }
        mPaging3.setOnClickListener {
            startActivity(Intent(this, Paging3Activity::class.java))
        }
    }

}