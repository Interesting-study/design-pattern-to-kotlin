package com.gof.pattern.prototype.after

class GithubIssue : Cloneable {
    var id: Int = 0
    var title: String = ""
    var repository: GithubRepository = GithubRepository()

    constructor(repository: GithubRepository) {
        this.repository = repository
    }

    fun getUrl(): String {
        return String.format(
            "https://github.com/%s/%s/issues/%d",
            repository.user,
            repository.name,
            this.id
        )
    }

    public override fun clone(): GithubIssue {
        return super.clone() as GithubIssue
    }
}
