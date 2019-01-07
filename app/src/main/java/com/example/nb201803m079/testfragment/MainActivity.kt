package com.example.nb201803m079.testfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.detailContainer, HogeFragment.createInstance(this) )
            transaction.commit()
        }
    }
}
