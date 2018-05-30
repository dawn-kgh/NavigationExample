package com.seroo.gyooha.navigationexample.ui.detail

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.seroo.gyooha.navigationexample.R
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {
    private val detailViewModel by lazy {
        ViewModelProviders.of(this).get(DetailViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_detail, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpBottom((childFragmentManager.findFragmentById(R.id.fm_fragment_detail) as NavHostFragment).navController)

    }

    private fun setUpBottom(navController: NavController) {
        NavigationUI.setupWithNavController(bn_fragment_detail, navController)

    }
}