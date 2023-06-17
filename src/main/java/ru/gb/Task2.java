package ru.gb;

/**
 * 2. Если необходимо, исправьте данный код:
 * (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        code(intArray);
    }

// Оригинальный код:
//
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }

    // Исправленный код, добавлена проверка на ArrayIndexOutOfBoundsException:
    public static void code(int[] intArray) {
        try {
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            // добавлено, вполне возможен выход за пределы массива
            System.out.println("Выход за пределы массива");
        }
    }
}
