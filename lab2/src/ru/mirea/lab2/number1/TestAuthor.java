package ru.mirea.lab2.number1;
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Pavel Kondratev", "pashok143@gmail.com", 'M');
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
    }
}
