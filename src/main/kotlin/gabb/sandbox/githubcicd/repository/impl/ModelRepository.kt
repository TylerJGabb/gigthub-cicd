package gabb.sandbox.githubcicd.repository.impl

import gabb.sandbox.githubcicd.model.Model
import org.springframework.stereotype.Component

@Component
class ModelRepository : Repository<Model> {

    private val models = listOf(
        Model(1, "Tyler"),
        Model(2, "Ana"),
        Model(3, "Emma")
    )

    override fun getAll(): List<Model> = models


}