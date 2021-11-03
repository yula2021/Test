package org.itstep;

import java.util.Arrays;


public class Test3 {

    public static void main(String[] args) {
//Вариант 3. Дан двумерный массив nxn целых чисел. Вывести строку, сумму элементов которой минимальна.
        int[][] array = {{2, 5, 7, 3}, {9, 3, 7, 1}, {5, 2, 3, 8}};
        System.out.println(Arrays.toString(sum2(array)));


    }

    public static int[] sum2(int[][] array) {

        int[] result = new int[array.length];

        int rowIndex = 0;

        for (int[] row : array) {
            int total = 0;

            //Calculate the sum of the row
            for (int n : row) {
                total += n;
            }

            //Store the sum in the result
            result[rowIndex++] = total;


        }

        return result;
    }
}

