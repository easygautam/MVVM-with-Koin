package com.example.mvvmwithkoin.di

import com.example.mvvmwithkoin.repository.UserCache
import com.example.mvvmwithkoin.repository.UserCacheImpl
import org.koin.dsl.module

/**
 * Create a cache module that holds all cache dependencies
 */
val cacheModule = module {
    /**
     * Create a [UserCache] dependency, this will create a singleton instance of the [UserCache]
     */
    single<UserCache> {
        // Init a user cache implementation
        UserCacheImpl(mutableListOf())
    }
}