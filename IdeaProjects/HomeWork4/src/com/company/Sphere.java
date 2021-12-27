package com.company;

public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable {


    private double radius = getX();


    public Sphere(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }

}
