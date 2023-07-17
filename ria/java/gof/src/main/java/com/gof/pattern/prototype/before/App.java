package com.gof.pattern.prototype.before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");


        GithubIssue githubIssue = new GithubIssue();
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과졔: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);
    }
}
