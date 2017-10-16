package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private ShapeCollector shapeCollector;
    private Triangle triangle1;

    @Before
    public void addShapeCollector() {
        shapeCollector = new ShapeCollector();
        triangle1 = new Triangle(3.0f, 4.0f, "TriangleOne");


    }

    @Test
    public void testAddFigure() {
        String result = shapeCollector.addFigure(triangle1);
        Assert.assertEquals(triangle1, result);
    }

    ;

    @Test
    public void testRemoveFigure() {
        shapeCollector.addFigure(triangle1);
        String result = shapeCollector.removeFigure(triangle1);
        Assert.assertEquals(null, result);

    }

    ;

    @Test
    public void testGetFigure() {
        shapeCollector.addFigure(triangle1);
        String result = shapeCollector.getFigure(0);
        Assert.assertEquals(triangle1, result);
    }

    ;

    @Test
    public void testShowFigures() {
        Square square1 = new Square(3, "SquareOne");
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(square1);

        String result = shapeCollector.showFigures();
        List<Object> shapeCollectors2 = new ArrayList<>();
        shapeCollectors2.add(triangle1);
        shapeCollectors2.add(square1);

        Assert.assertEquals(shapeCollectors2, result);

    }

    ;
}
