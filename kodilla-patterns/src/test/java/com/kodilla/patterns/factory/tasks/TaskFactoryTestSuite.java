package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task shoppingtask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingtask.executeTask();

        Assert.assertEquals("Buy in store", shoppingtask.getTaskName());
        Assert.assertEquals(true, shoppingtask.isTaskExecuted());


    }

    @Test
    public void testDrivingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();

        Assert.assertEquals("Drive to Martha", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());

    }

    @Test
    public void testPaintingTask() {

        TaskFactory taskFactory = new TaskFactory();

        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();

        Assert.assertEquals("Paint ", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }
}
