package com.kodilla.testing.shape;

public class Triangle implements Shape {
    float side;
    float height;
    String triangleName;

    public Triangle(float side, float height, String triangleName) {
        this.side = side;
        this.height = height;
        this.triangleName = triangleName;
    }

    @Override
    public String getShapeName() {
        return triangleName;
    }

    @Override
    public float getField() {
        return side * height;
    }
}