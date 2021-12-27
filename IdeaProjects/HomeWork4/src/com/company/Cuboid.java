package com.company;

public class Cuboid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private double height = getX();
    private double weight = getY();
    private double depth = getZ();

    public Cuboid(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public double getArea() {
        return 2 * (weight * depth + weight * height + depth * height);
    }

    @Override
    public double getVolume() {
        return height * weight * depth;

    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                ", weight=" + weight +
                ", depth=" + depth +
                '}';
    }
}
