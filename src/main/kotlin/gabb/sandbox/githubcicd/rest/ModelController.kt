package gabb.sandbox.githubcicd.rest

import gabb.sandbox.githubcicd.model.Model
import gabb.sandbox.githubcicd.repository.impl.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ModelController(
    private val repository: Repository<Model>
) {

    @GetMapping("/model")
    fun getAll() = repository.getAll()

}