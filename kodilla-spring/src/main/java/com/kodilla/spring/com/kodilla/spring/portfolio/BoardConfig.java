package com.kodilla.spring.com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;

public class BoardConfig {
    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList doneList() {
        return new TaskList();
    }
}
