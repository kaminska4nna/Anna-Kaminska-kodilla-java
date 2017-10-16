package com.kodilla.testing.shape;

import static java.lang.Math.PI;

public class Circle implements Shape {
    float radius;
    String circleName;

    public Circle(float radius, String circleName) {
        this.radius = radius;
        this.circleName = circleName;
    }

    @Override
    public String getShapeName() {
        return circleName;
    }

    @Override
    public float getField() {
        return (float) (PI * radius * radius);

    }
}
