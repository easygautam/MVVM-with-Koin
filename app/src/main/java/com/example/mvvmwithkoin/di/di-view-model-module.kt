package com.example.mvvmwithkoin.di

import com.example.mvvmwithkoin.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        UserViewModel(get())
    }

}