package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User martha = new ZGeneration("Martha Smith");

        String stevenSharesPost = steven.sharePost();
        System.out.println("Steven shares post on: " + stevenSharesPost);
        String johnSharesPost = john.sharePost();
        System.out.println("John shares post on: " + johnSharesPost);
        String marthaSharesPost = martha.sharePost();
        System.out.println("Martha shares post on: " + marthaSharesPost);

        Assert.assertEquals("Twitter", stevenSharesPost);
        Assert.assertEquals("Facebook", johnSharesPost);
        Assert.assertEquals("Snapchat", marthaSharesPost);
    }

    @Test
    public void testIndividualSharingStrategy() {

        User steven = new Millenials("Steven Links");

        String stevenSharesPosts = steven.sharePost();
        System.out.println("Steven shares on : " + stevenSharesPosts);
        steven.setSharingStrategy(new FacebookPublisher());
        stevenSharesPosts = steven.sharePost();
        System.out.println("Steven now shares on : " + stevenSharesPosts);

        Assert.assertEquals("Facebook", stevenSharesPosts);

    }

}
