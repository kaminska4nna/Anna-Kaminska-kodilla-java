package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForum = Forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1997 && forumUser.getDateOfBirth().getYear() > 1987)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}



