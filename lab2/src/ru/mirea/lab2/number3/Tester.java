package ru.mirea.lab2.number3;
import java.util.Scanner;

public class Tester {
    private Circle[] circles;
    private int numberOfCircles;
    public Tester(int capacity) {
        circles = new Circle[capacity];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles] = circle;
            numberOfCircles++;
        } else {
            System.out.println("Массив полон. Нельзя добавить больше окружностей.");
        }
    }

    public void displayCircles() {
        for (int i = 0; i < numberOfCircles; i++) {
            System.out.println("Окружность " + (i + 1) + ":");

            System.out.println("Центр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Радиус: " + circles[i].getRadius());
            System.out.println("Периметр: "+Math.round(circles[i].Perimeter(circles[i].getRadius())));
            System.out.println("Площадь: "+ Math.round((circles[i].Square(circles[i].getRadius()))));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите кол-во кругов: ");
        int x = sc.nextInt();
        Tester tester = new Tester(x);
        Point center = new Point(5,5);
        Circle circleRad3 = new Circle(center,3);
        Point centerNew = new Point(2,4);
        Circle circleRad7 = new Circle(centerNew,6);
        tester.addCircle(circleRad3);
        tester.addCircle(circleRad7);
        tester.displayCircles();
    }
}