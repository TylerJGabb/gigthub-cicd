package gabb.sandbox.githubcicd.repository.impl

interface Repository<T> {

    fun getAll(): List<T>

}