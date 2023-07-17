package com.gof.pattern.prototype.before

class GithubIssue {
    var id: Int = 0
    var title: String = ""
    private var repository: GithubRepository = GithubRepository()

    fun getUrl(): String {
        return String.format(
            "https://github.com/%s/%s/issues/%d",
            repository.user,
            repository.name,
            this.id
        )
    }
}
