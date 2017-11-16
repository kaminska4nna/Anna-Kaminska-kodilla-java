package com.kodilla.spring.portfolio;

import com.kodilla.spring.com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.com.kodilla.spring.portfolio.BoardConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> toDoList = board.toDoList.getTasks();
        List<String> inProgressList = board.inProgressList.getTasks();
        List<String> doneList = board.doneList.getTasks();

        toDoList.add("Wash the dishes");
        inProgressList.add("Go shopping");
        doneList.add("Rest");

        List<String> test1 = new ArrayList<>();
        List<String> test2 = new ArrayList<>();
        List<String> test3 = new ArrayList<>();

        test1.add("Wash the dishes");
        test2.add("Go shopping");
        test3.add("Rest");


        Assert.assertEquals(test1, toDoList);
        Assert.assertEquals(test2, inProgressList);
        Assert.assertEquals(test3, doneList);


    }
}
