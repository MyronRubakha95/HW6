package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle trianglePerimeter = new Triangle(2, 2);
        Triangle triangleArea = new Triangle(2, 2);

        System.out.println("Периметр трикутника = " + trianglePerimeter.getPerimeter());
        System.out.println("Площа трикутника = " + triangleArea.getArea());

        Rectangle rectanglePerimeter = new Rectangle(25, 50);
        Rectangle rectangleArea = new Rectangle(25, 50);
        System.out.println("Периметр прямокутника = " + rectanglePerimeter.getPerimeter());
        System.out.println("Площа прямокутника = " + rectangleArea.getArea());

        Circle circlePerimeter = new Circle(25, 0);
        Circle circleArea = new Circle(25, 0);
        System.out.println("Периметр круга = " + circlePerimeter.getPerimeter());
        System.out.println("Площа круга = " + circleArea.getArea());

        SquarePyramid squarePyramidArea = new SquarePyramid(20, 20, 0);
        SquarePyramid squarePyramidVolume = new SquarePyramid(20, 20, 0);
        System.out.println("Площа піраміди = " + squarePyramidArea.getArea());
        System.out.println("Об'єм піраміди = " + squarePyramidVolume.getVolume());

        Cuboid cuboidArea = new Cuboid(10, 20, 30);
        Cuboid cuboidVolume = new Cuboid(5, 6, 7);
        System.out.println("Площа куба = " + cuboidArea.getArea());
        System.out.println("Об'єм куба = " + cuboidVolume.getVolume());

        Sphere sphereArea = new Sphere(20, 0, 0);
        Sphere sphereVolune = new Sphere(10, 0, 0);
        System.out.println("Площа сфери = " + sphereArea.getArea());
        System.out.println("Об'єм сфери = " + sphereVolune.getVolume());

    }
}
