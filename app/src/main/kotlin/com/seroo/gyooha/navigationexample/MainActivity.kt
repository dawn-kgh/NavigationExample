package com.seroo.gyooha.navigationexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tb_activity_main.title = getString(R.string.app_name)

        setUpBottomNavigation((supportFragmentManager
            .findFragmentById(R.id.fm_activity_main) as NavHostFragment).navController)
    }

    private fun setUpBottomNavigation(navController: NavController) {
        NavigationUI.setupWithNavController(bn_activity_main, navController)
    }
}