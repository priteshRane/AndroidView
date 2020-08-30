package com.ransoft.androidview.ui.codelabcustomview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ransoft.androidview.R

class CustomFanControllerFragment : Fragment() {

    companion object {
        fun newInstance() = CustomFanControllerFragment()
    }

    private lateinit var viewModel: CustomFanControllerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.custom_fan_controller_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CustomFanControllerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}