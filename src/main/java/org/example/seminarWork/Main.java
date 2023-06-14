package org.example.seminarWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massiv = {1, 8, 4, 4, 5, 4, 3, 5, 1};
        //System.out.println("polindrom(massiv) = " + polindrom(massiv));
        //int[] array = runningSum(massiv);
        //printIntArray(array);
        System.out.println("numberPairsAdjacentElementsArray(massiv) = " + numberPairsAdjacentElementsArray(massiv));

    }

    private static void printIntArray(int[] array) {
        for (int i :
                array) {
            System.out.print(i + " ");
        }
    }

    /**
     * @param array входной массив
     * @return boolean семетричный или нет ввиде true or false
     * @apiNote Проверяет являтся ли массив семметричным
     */
    private static boolean polindrom(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Задан массив nums. Мы определяем текущую сумму массива как
     * runningSum[i] = sum(nums[0]...nums[i]).
     * Возвращает текущую сумму чисел.
     * Example:
     * Input: nums = [3,1,2,10,1]
     * Output: [3,4,6,16,17
     */

    private static int[] runningSum(int[] array) {
        int[] array_sum = new int[array.length];
        array_sum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            array_sum[i] = array[i] + array_sum[i - 1];
            //или можно так: строку 38 не надо, array[i] += array[i-1]
        }
        return array_sum;
    }

    /**
     * 2) Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
     * перед которыми идет четное число.
     */
    private static int sumNaturalNumber(Scanner scanner) {
        int sum = 0;
        System.out.print("Введите размер последовательности целых чисел: ");
        int size = scanner.nextInt();
        System.out.print("Введите целое число: ");
        int firstNumber = scanner.nextInt();
        for (int i = 0; i < size - 1; i++) {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            if (firstNumber % 2 == 0 && number % 10 == 5) sum = sum + number;
            firstNumber = number;
        }
        return sum;
    }
    /**
     * @apiNote Находит количество пар соседних элементов, где первый элемент вдвое больше второго.
     * @param array
     * @return количество пар, count
     */
    private static int numberPairsAdjacentElementsArray(int[] array){
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == array[i] * 2) count++;
        }
        return count;
    }



}
