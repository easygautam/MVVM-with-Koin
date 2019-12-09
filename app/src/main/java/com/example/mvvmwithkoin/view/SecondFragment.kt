package com.example.mvvmwithkoin.view

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mvvmwithkoin.R
import com.example.mvvmwithkoin.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class SecondFragment : Fragment() {


    companion object {
        fun newInstance() = FirstFragment()
    }

    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        println("[SecondFragment] user name ${userViewModel.name}")

    }


}
