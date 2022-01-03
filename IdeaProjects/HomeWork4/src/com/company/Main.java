package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] shape = new Shape[6];


        Point[] PointTriangel = new Point[3];

        PointTriangel[0] = new Point(5, 3);
        PointTriangel[1] = new Point(4, 2);
        PointTriangel[2] = new Point(5, 0);
        Triangle triangle = new Triangle(PointTriangel);
        triangle.getPerimeter();
        triangle.getArea();
        System.out.println(triangle);


        Point[] PointRectangel = new Point[1];
        PointRectangel[0] = new Point(1, 3);
        Rectangle rectangle = new Rectangle(PointRectangel, 5, 3);
        rectangle.getPerimeter();
        rectangle.getArea();
        System.out.println(rectangle);


        Point[] PointCircle = new Point[1];
        PointCircle[0] = new Point(2, 3);
        Circle circle = new Circle(PointCircle, 5);
        circle.getArea();
        circle.getPerimeter();
        System.out.println(circle);

        Point[] PointPyramid = new Point[1];
        PointPyramid[0] = new Point(10, 5, 6);
        SquarePyramid squarePyramid = new SquarePyramid(PointPyramid, 2, 3);
        squarePyramid.getArea();
        squarePyramid.getVolume();
        System.out.println(squarePyramid);

        Point[] PointCuboid = new Point[1];
        PointCuboid[0] = new Point(5, 6, 7);
        Cuboid cuboid = new Cuboid(PointCuboid, 5, 6, 6);
        cuboid.getVolume();
        cuboid.getArea();
        System.out.println(cuboid);

        Point[] PointSphere = new Point[1];
        PointSphere[0] = new Point(5, 6, 7);
        Sphere sphere = new Sphere(PointSphere, 8);
        sphere.getArea();
        sphere.getVolume();
        System.out.println(sphere);
    }
}
