package com.kodilla.spring;

import com.kodilla.spring.com.kodilla.spring.shape.Circle;
import com.kodilla.spring.com.kodilla.spring.shape.Shape;
import com.kodilla.spring.com.kodilla.spring.shape.Square;
import com.kodilla.spring.com.kodilla.spring.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestsSuite {

    @Test
    public void testCircleLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);

        String name = shape.getShapeName();

        Assert.assertEquals("This is a circle", name);
    }

    @Test
    public void testRectangleLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);

        String name = shape.getShapeName();

        Assert.assertEquals("This is a triangle", name);

    }

    @Test
    public void testSquareLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);

        String name = shape.getShapeName();

        Assert.assertEquals("This is a square.", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("choosenShape");

        String name = shape.getShapeName();

        System.out.println("Choosen shape says: " + name);
    }

}
