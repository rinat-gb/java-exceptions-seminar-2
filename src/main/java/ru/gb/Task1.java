package ru.gb;

import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float)
 * и возвращает введенное значение.
 * <p>
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого
 * необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        float num = enterFloatNum();
        System.out.println("Введённое число: " + num);
    }

    public static float enterFloatNum() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                float num = Float.parseFloat(scanner.nextLine());
                return num;
            } catch (Exception e) {
                System.out.println("Некорректный ввод, попробуйте ещё раз!");
            }
        }
    }
}
