package com.gof.pattern.prototype.after

class App

fun main() {
    var repository: GithubRepository = GithubRepository()
    repository.user = "whiteship"
    repository.name = "live-study"

    var githubIssue: GithubIssue = GithubIssue(repository)
    githubIssue.id = 1
    githubIssue.title = "1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가"

    val url = githubIssue.getUrl()
    println(url)

    val clone = githubIssue.clone()
    println(clone.getUrl())

    println(clone != githubIssue)
    println(clone == githubIssue)
    println(clone.javaClass === githubIssue.javaClass)
    println(clone.repository === githubIssue.repository)
}
