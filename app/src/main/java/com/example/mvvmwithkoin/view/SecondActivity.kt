package com.example.mvvmwithkoin.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmwithkoin.R
import com.example.mvvmwithkoin.databinding.ActivitySecondBinding
import com.example.mvvmwithkoin.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondActivity : AppCompatActivity() {

    private val userViewModel by viewModel<UserViewModel>()


    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, SecondActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivitySecondBinding>(this, R.layout.activity_second)
        binding.activity = this
        binding.userViewModel = userViewModel

        userViewModel.name.set("Saad")

        println("[SecondActivity] user name ${userViewModel.name}")
    }
}
