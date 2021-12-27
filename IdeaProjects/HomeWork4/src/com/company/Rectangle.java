package com.company;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {


    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getPerimeter() {
        return (getX() + getY()) * 2;
    }

    @Override
    public double getArea() {
        return getX() * getY();
    }
}
