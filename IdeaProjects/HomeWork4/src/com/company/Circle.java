package com.company;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {


    public Circle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getX();
    }

    @Override
    public double getArea() {
        return Math.PI * getX() * getX();
    }
}
