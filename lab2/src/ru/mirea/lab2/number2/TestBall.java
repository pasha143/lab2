package ru.mirea.lab2.number2;
public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(20.0, 10.0);
        System.out.println("Исходные Координаты мяча: "+ ball.toString());
        ball.move(5.0,2.0);
        System.out.println("Новые координаты мяча: " + ball);
        ball.setXY(10.0,11.0);
        System.out.println("Измененные координаты мяча: " + ball);
    }
}