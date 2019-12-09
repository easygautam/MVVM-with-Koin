package com.example.mvvmwithkoin.repository

/**
 * User repository template
 */
interface UserRepository {

    fun saveUser(user: User)

    fun findAllUser(): List<User>

}

/**
 * User repository implementation, This works with [UserCache] to manage user data
 */
class UserRepositoryImpl(private val userCache: UserCache) : UserRepository {

    override fun saveUser(user: User) {
        return userCache.save(user)
    }

    override fun findAllUser(): List<User> {
        return userCache.getAll()
    }
}