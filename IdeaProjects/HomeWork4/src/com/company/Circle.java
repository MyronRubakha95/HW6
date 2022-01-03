package com.company;

public class Circle extends PlaneShape {
    private double radius;
    private double perimeter;
    private double area;

    public Circle(Point[] vertices, double radius) {
        super(vertices);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
