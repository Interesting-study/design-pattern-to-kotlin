package com.gof.pattern.prototype.before

class App

fun main() {
    var repository: GithubRepository = GithubRepository()
    repository.user = "whiteship"
    repository.name = "live-study"

    var githubIssue: GithubIssue = GithubIssue()
    githubIssue.id = 1
    githubIssue.title = "1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가"

    val url = githubIssue.getUrl()
    println(url)
}
