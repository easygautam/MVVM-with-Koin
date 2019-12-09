package com.example.mvvmwithkoin.di

import com.example.mvvmwithkoin.repository.UserRepository
import com.example.mvvmwithkoin.repository.UserRepositoryImpl
import org.koin.dsl.module

/**
 * Repository module for define all repository dependencies
 */
val repositoryModule = module {

    /**
     * Define a singleton of [UserRepository] that will provide dependency wherever required
     */
    single<UserRepository> {
        UserRepositoryImpl(get())
    }

}