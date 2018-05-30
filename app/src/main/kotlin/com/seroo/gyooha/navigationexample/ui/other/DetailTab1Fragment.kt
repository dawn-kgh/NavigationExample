package com.seroo.gyooha.navigationexample.ui.other


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.seroo.gyooha.navigationexample.R
import kotlinx.android.synthetic.main.fragment_detail_tab1.*


class DetailTab1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_tab1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_detail_tab1_fragment.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.deepDetailFragment)
        }
    }


}
