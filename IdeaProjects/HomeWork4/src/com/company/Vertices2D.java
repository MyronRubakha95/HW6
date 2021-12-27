package com.company;

public class Vertices2D {
    private double x;
    private double y;

    public Vertices2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Vertices2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(Vertices2D a, Vertices2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}