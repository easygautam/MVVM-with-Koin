package com.example.mvvmwithkoin.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.mvvmwithkoin.repository.UserRepository

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {


    val name = ObservableField<String>()

    init {
        println("[UserViewModel] initialized $this ")
    }


    override fun onCleared() {
        super.onCleared()
        println("[UserViewModel] cleared $this ")
    }

}