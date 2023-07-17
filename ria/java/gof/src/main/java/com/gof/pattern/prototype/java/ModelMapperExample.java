package com.gof.pattern.prototype.java;

import com.gof.pattern.prototype.after.GithubIssue;
import com.gof.pattern.prototype.after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과졔: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가");

        // 리플렉션 사용
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData);
    }
}
