package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String name;
    private final int userID;
    private final int posts;
    private final char sex;
    private final LocalDate dateOfBirth;

    public ForumUser(String name, int userID, int posts, char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth) {
        this.name = name;
        this.userID = userID;
        this.posts = posts;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        ;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    public int getPosts() {
        return posts;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", userID=" + userID +
                ", posts=" + posts +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
