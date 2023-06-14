package org.example.homeWork;

import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sumNaturalNumber(scanner) = " + sumNaturalNumber(scanner));
    }

    /**
     * @apiNote Проверяет является ли число число простым
     * @param number, принимает на вход целое число
     * @return возвращает true or false
     */
    private static boolean checkNaturalNumber(int number) {
        int count = 2;
        while (count <= number / 2) {
            if (number % count == 0)
                return false;
            count++;
        }
        return true;
    }


    /**
     * @apiNote суммирует простые числа последоватенльности N целых чисел.
     * @param scanner
     * @return сумму простых чисел.
     */

    private static int sumNaturalNumber(Scanner scanner) {
        int sum = 0;
        System.out.print("Введите размер последовательности целых чисел: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            if(checkNaturalNumber(number)) sum = sum + number;
        }
        return sum;
    }
}