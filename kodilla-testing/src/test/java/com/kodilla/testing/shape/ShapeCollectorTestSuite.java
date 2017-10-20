package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

        shapeCollector.addFigure(triangle1);
        Assert.assertEquals(1, shapeCollector.getFigureNumbers());
    }


    @Test
    public void testGetFigure() {

        shapeCollector.addFigure(triangle1);

        Shape addedFigure;
        addedFigure = shapeCollector.getFigure(0);

        Assert.assertEquals(triangle1, addedFigure);
    }



    @Test
    public void testRemoveFigure() {
        shapeCollector.addFigure(triangle1);

        boolean result = shapeCollector.removeFigure(triangle1);

        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFigureNumbers());
    }

    @Test
    public void testShowFigures() {

        Square square1 = new Square(2.0f, "square1");
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(square1);

        ShapeCollector result = new ShapeCollector();
        result.addFigure(triangle1);
        shapeCollector.addFigure(square1);

        Assert.assertEquals(result, shapeCollector);

    }

}