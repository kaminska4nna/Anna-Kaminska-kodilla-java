package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.Map;

public class StatisticsImplementation {
    private Statistics statistics;
    public Map<String, Double> statisticsList = new HashMap<>();


    public StatisticsImplementation(Statistics statistics) {
        this.statistics = statistics;
    }

    public int countUsers() {
        int usersCount = statistics.usersNames().size();
        return usersCount;
    }

    public int countPosts() {
        int postsCount = statistics.postsCount();
        return postsCount;
    }

    public int countComments() {
        int commentsCount = statistics.commentsCount();
        return commentsCount;
    }

    public double averagePostPerUser() {
        double postPerUser = statistics.postsCount() / statistics.usersNames().size();
        return postPerUser;

    }

    public double averageCommentPerUser() {
        double commentPerUser = statistics.commentsCount() / statistics.usersNames().size();
        return commentPerUser;
    }

    public double averageCommentPerPost() {
        double commentPerPost = statistics.commentsCount() / statistics.postsCount();
        return commentPerPost;
    }

    void calculateAdvStatistics(Statistics statistics) {

        statisticsList.put("Users ", (double) countUsers());
        statisticsList.put("Posts", (double) countPosts());
        statisticsList.put("Comments", (double) countComments());
        statisticsList.put("Posts per User", averagePostPerUser());
        statisticsList.put("Comment per User", averageCommentPerUser());
        statisticsList.put("Comment per Post", averageCommentPerPost());
    }

    Map<String, Double> showStatistics() {

        return statisticsList;
    }


}
