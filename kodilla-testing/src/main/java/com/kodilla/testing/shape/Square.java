package com.kodilla.testing.shape;

public class Square implements Shape {
    float side;
    String squareName;

    public Square(float side, String squareName) {
        this.side = side;
        this.squareName = squareName;
    }

    @Override
    public String getShapeName() {
        return squareName;
    }

    @Override
    public float getField() {
        return side * side;
    }
}
