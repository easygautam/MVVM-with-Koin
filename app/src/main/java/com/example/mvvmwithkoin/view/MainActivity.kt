package com.example.mvvmwithkoin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mvvmwithkoin.R
import com.example.mvvmwithkoin.databinding.ActivityMainBinding
import com.example.mvvmwithkoin.repository.User
import com.example.mvvmwithkoin.repository.UserRepository
import com.example.mvvmwithkoin.viewmodel.UserViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val userRepository by inject<UserRepository>()
    private val userViewModel by viewModel<UserViewModel>()
    private val userViewModel2 by viewModel<UserViewModel>()
//    private val userViewModel3 by view


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.activity = this
        binding.userViewModel = userViewModel2

        userRepository.saveUser(User("Gautam"))
        userRepository.saveUser(User("Saad"))
        userRepository.saveUser(User("Mehtab"))

        userRepository.findAllUser().forEach { println(it.name) }

        userViewModel.name.set("Gautam")

        println("[MainActivity] user name ${userViewModel.name}")
    }

    fun onNextClick() = View.OnClickListener {
        SecondActivity.start(this)
    }

}
