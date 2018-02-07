package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTestSuite {

    @Test
    public void testInformMentor() {
        //Given
        Teacher mike = new Teacher("Mike");
        Teacher john = new Teacher("John");

        Student anna = new Student(mike, "Anna");
        Student marta = new Student(john, "Marta");

        //When
        anna.addExercise("Homework nr 1 done!");
        marta.addExercise("Homework nr 1 done!");
        anna.addExercise("Homework nr 2 done!");

        //Then
        assertEquals(2, mike.getUpdateCount());
        assertEquals(1, john.getUpdateCount());
    }


    @Test
    public void testSubmitExercise() {
        //Given
        Teacher mike = new Teacher("Mike");
        Teacher john = new Teacher("John");

        Student anna = new Student(mike, "Anna");
        Student marta = new Student(john, "Marta");

        //When
        anna.addExercise("Homework nr 1 done!");
        marta.addExercise("Homework nr 1 done!");
        anna.addExercise("Homework nr 2 done!");

        mike.submitExercise(anna);
        john.submitExercise(marta);

        //Then
        assertEquals(1, anna.getExercises().size());
        assertEquals(0, marta.getExercises().size());
    }

}
