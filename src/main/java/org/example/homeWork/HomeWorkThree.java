package org.example.homeWork;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму
 * индексов двузначных элементов массива.
 * Пример:
 * Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
 * Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
 * Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
 */
public class HomeWorkThree {
    public static void main(String[] args) {

        int[] massiv = {1, -22, 33, 44, 5, -5, -3, 23, -7, 100};
        int[] array = changeArray(massiv);
        printArray(array);
    }

    /**
     * @apiNote считает сумму индексов двузначных элементов массива
     * @param massiv на вход массив целых чисел
     * @return int sum
     */
    private static int sumIndexArrey(int[] massiv) {
        int sum = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (Math.log10(Math.abs(massiv[i])) >= 1 && Math.log10(Math.abs(massiv[i])) < 2) sum += i;
        }
        return sum;
    }

    /**
     * @apiNote Заменяет отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param massiv на вход массив целых чисел
     * @return выход массив целых чисел
     */
    private static int[] changeArray(int[] massiv) {
        int sumIndex = sumIndexArrey(massiv);
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 0) massiv[i] = sumIndex;
        }
        return massiv;
    }

    /**
     * @apiNote печать в консоль одномерный массив
     * @param massiv на вход массив целых чисел
     */
    private static void printArray(int[] massiv) {

        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
    }
}
