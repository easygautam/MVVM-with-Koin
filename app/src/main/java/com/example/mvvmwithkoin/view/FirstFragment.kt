package com.example.mvvmwithkoin.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvvmwithkoin.R
import com.example.mvvmwithkoin.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel

class FirstFragment : Fragment() {

    companion object {
        fun newInstance() = FirstFragment()
    }

    private lateinit var userViewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        userViewModel = activity!!.getViewModel()
        println("[FirstFragment] user name ${userViewModel.name}")

    }

}
