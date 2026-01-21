package edu.bsu.cs;

public class AreaCalculator {
    public static double getAreaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double getAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double getAreaOfTriangle(double base, double height) {
        return (base * height) / 2.0;
    }
}
