package ru.gb;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {

    public static void main(String[] args) {
        try {
            String str = enterString();
            System.out.println("Введённая строка: " + str);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String enterString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        if (str.isEmpty())
            throw new RuntimeException("Пустые строки вводить нельзя!");

        return str;
    }
}
