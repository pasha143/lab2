package ru.mirea.lab3.mathrandom.number2;

public class Circle {
    private Point center;
    private double Radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.Radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return Radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", Radius=" + Radius +
                '}';
    }
}
