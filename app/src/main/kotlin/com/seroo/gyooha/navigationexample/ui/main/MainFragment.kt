package com.seroo.gyooha.navigationexample.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.seroo.gyooha.navigationexample.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    val mainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(v: View, savedInstanceState: Bundle?) {
        super.onViewCreated(v, savedInstanceState)

        btn_move_to_cat1.setOnClickListener { Navigation.findNavController(it).navigate(R.id.moreCat1Fragment, null) }
        btn_move_to_cat2.setOnClickListener { Navigation.findNavController(it).navigate(R.id.moreCat2Fragment, null) }
        btn_move_to_detail.setOnClickListener { Navigation.findNavController(it).navigate(R.id.detailFragment, null) }
    }
}