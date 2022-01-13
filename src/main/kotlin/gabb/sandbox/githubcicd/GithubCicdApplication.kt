package gabb.sandbox.githubcicd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubCicdApplication

fun main(args: Array<String>) {
	runApplication<GithubCicdApplication>(*args)
}
