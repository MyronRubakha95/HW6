package com.company;

public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    double baseWidth = getX();
    double baseHeight = getY();

    public SquarePyramid(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(baseHeight, 2)) * baseWidth;
    }


    @Override
    public double getVolume() {
        return baseWidth * baseWidth * baseHeight / 3;
    }


}
