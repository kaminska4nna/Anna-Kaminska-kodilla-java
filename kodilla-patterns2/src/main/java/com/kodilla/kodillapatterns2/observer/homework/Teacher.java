package com.kodilla.kodillapatterns2.observer.homework;

public class Teacher implements Observer {
    private final String teacherName;
    private int updateCount;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Student student) {
        System.out.println(teacherName + ": task by " + student.getStudentName() + "\n" +
                "To check: " + student.getExercises().size() + "\n" +
                " Exercises to check: ");
        student.getExercises().forEach(System.out::println);
        updateCount++;
    }

    @Override
    public String getExercise(Student student) {
        System.out.println("Checking exercise " + student.getExercises().peek());
        return student.getExercises().peek();
    }

    @Override
    public void submitExercise(Student student) {
        System.out.println("Exercise: [" + student.getExercises().peek() + "] Submitted");
        notifyStudent(student.getStudentName(), student.getExercises().peek());
        student.getExercises().poll();
    }

    @Override
    public void notifyStudent(String studentName, String exercise) {
        System.out.println(studentName + " : " + exercise + " was submitted by " + teacherName);
    }

    public int getUpdateCount() {
        return updateCount;
    }
}