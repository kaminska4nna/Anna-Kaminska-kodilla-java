package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyWillThrowException(4.0, 3.0);
        } catch (Exception e) {
            System.out.println("Something is wrong !");
        }

    }

}
