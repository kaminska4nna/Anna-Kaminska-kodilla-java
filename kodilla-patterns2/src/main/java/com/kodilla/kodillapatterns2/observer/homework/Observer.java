package com.kodilla.kodillapatterns2.observer.homework;

public interface Observer {

    void update(Student student);

    String getExercise(Student student);

    void submitExercise(Student student);

    void notifyStudent(String studentName, String exercise);
}
