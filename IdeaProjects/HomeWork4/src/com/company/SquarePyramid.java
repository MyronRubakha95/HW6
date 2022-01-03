package com.company;

public class SquarePyramid extends SpaceShape {
    private double width;
    private double height;
    private double area;
    private double volume;


    public SquarePyramid(Point[] vertices, double width, double height) {
        super(vertices);
        this.width = width;
        this.height = height;

    }

    @Override
    public double getArea() {
        area = 4 * (Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) * width) + width * width;
        return area;
    }

    @Override
    public double getVolume() {
        volume = width * width * height / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                ", volume=" + volume +
                '}';
    }
}
