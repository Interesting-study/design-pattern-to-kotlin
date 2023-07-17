package com.gof.pattern.prototype.before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GithubIssue {

    private int id;

    private String title;

    private GithubRepository repository;

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }
}
