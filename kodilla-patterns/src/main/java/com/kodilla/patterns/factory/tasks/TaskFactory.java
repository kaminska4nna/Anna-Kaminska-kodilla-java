package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "SQUARE";
    public static final String DRIVINGTASK = "RECTANGLE";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy in store", "Apples", 2.0);
            case PAINTINGTASK:
                return new PaintingTask("Paint ", "blue", "bathroom");
            case DRIVINGTASK:
                return new DrivingTask("Drive to Martha", "Grójec", "car");
            default:
                return null;
        }
    }
}
