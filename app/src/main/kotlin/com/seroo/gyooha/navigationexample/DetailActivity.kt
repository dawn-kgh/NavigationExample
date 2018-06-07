package com.seroo.gyooha.navigationexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btn_activity_detail.setOnClickListener{ Navigation.findNavController(it).navigate(R.id.mainActivity)}
    }
}