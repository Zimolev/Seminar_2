package org.example.homeWork;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("increasingSequenceOrNot(scanner) = " + increasingSequenceOrNot(scanner));
    }
    /**
     * Дана последовательность из N целых чисел.
     * Верно ли, что последовательность является возрастающей
     */
    private static boolean increasingSequenceOrNot(Scanner scanner) {
        System.out.print("Введите размер последовательности целых чисел: ");
        int size = scanner.nextInt();
        System.out.print("Введите целое число: ");
        int firstNumber = scanner.nextInt();
        for (int i = 0; i < size - 1; i++) {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            if (firstNumber < number) firstNumber = number;
            else return false;
        }
        return true;
    }
}
