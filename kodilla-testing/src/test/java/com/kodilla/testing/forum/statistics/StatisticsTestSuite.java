package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static final double DELTA = 1e-15;


    @Test(expected = java.lang.ArithmeticException.class)
    public void testAverageWhenPostAmount0() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmount = 0;
        ArrayList<String> usersList = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(postsAmount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.averagePostPerUser();

        //Then
        Assert.assertEquals(0, averageAmountOfPostsPerUserTest, DELTA);
    }

    @Test
    public void testAverageWhenPostAmount1000When100Users() {
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmount = 1000;
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("user");
        }

        when(statisticsMock.postsCount()).thenReturn(postsAmount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.averagePostPerUser();

        //Then
        Assert.assertEquals(10, averageAmountOfPostsPerUserTest, DELTA);

    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testAverageWhenPostAmount1000When0Users() {
        Statistics statisticsMock = mock(Statistics.class);
        int postsAmount = 1000;
        ArrayList<String> usersList = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(postsAmount);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);
        //When
        double averageAmountOfPostsPerUserTest = statisticsMethodsTest.averagePostPerUser();

        //Then
        Assert.assertEquals(0, averageAmountOfPostsPerUserTest, DELTA);

    }

    @Test
    public void testAverageWhenCommentsCount0() {
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 0;
        ArrayList<String> usersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User");
        }

        when(statisticsMock.postsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        double averageCommentPerUserTest = statisticsMethodsTest.averageCommentPerUser();

        //Then
        Assert.assertEquals(0, averageCommentPerUserTest, DELTA);

    }

    @Test
    public void testAverageWhenThereAreMorePostsThenComments() {
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 20;
        int posts = 40;

        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        double averageCommentPerPostTest = statisticsMethodsTest.averageCommentPerPost();

        //Then
        Assert.assertEquals(0.0, averageCommentPerPostTest, DELTA);

    }

    @Test
    public void testAverageWhenThereAreMoreCommentsThenPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        int comments = 40;
        int posts = 20;

        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.postsCount()).thenReturn(posts);
        StatisticsMethods statisticsMethodsTest = new StatisticsMethods(statisticsMock);

        //When
        double averageCommentPerPostTest = statisticsMethodsTest.averageCommentPerPost();

        //Then
        Assert.assertEquals(2.0, averageCommentPerPostTest, DELTA);

    }


}
