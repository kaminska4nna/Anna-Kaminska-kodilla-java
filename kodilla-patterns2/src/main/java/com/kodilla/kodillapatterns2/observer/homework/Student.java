package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayDeque;

public class Student implements Observable {
    private ArrayDeque<String> exercises;
    private Observer teacher;
    private String studentName;

    public Student(Observer teacher, String studentName) {
        exercises = new ArrayDeque<>();
        this.teacher = teacher;
        this.studentName = studentName;
    }

    public void addExercise(String exercise) {
        exercises.offer(exercise);
        notifyTeacher();
    }

    @Override
    public void notifyTeacher() {
        teacher.update(this);
    }

    public ArrayDeque<String> getExercises() {
        return exercises;
    }

    public Observer getTeacher() {
        return teacher;
    }

    public String getStudentName() {
        return studentName;
    }
}
