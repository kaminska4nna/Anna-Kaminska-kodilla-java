package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean execution;


    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public void executeTask() {
        System.out.println("Task " + taskName + " " + whatToBuy + " " + quantity + " is executed");
        setExecution(true);
    }

    public boolean isExecution() {
        return execution;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecution()) return true;
        return false;
    }


    public void setExecution(boolean execution) {
        this.execution = execution;
    }
}
