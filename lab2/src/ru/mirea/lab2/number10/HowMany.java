package ru.mirea.lab2.number10;
import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        int Count = countWords(input);
        System.out.println("Количество слов: " + Count);
    }
    private static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
