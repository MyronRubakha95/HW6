package com.company;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {


    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getPerimeter() {
        return getX() + getY() + getX();
    }


    @Override
    public double getArea() {
        return (getX() + getX()) * getY();
    }
}
