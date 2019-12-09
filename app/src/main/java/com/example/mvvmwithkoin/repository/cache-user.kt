package com.example.mvvmwithkoin.repository

/**
 * Template for user cache
 */
interface UserCache {

    fun save(user: User)

    fun getAll(): List<User>

}

/**
 * User cache implementation it uses user storage as [MutableList<User>]
 */
class UserCacheImpl(private val userStorage: MutableList<User>) : UserCache {

    override fun save(user: User) {
        userStorage.add(user)
    }

    override fun getAll(): List<User> {
        return userStorage
    }


}