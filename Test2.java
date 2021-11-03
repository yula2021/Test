package org.itstep;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        //Вариант 3. Дана строка, состоящая из произвольных символов. Найти символ, который встречается в ней чаще всего.
String str = "Дана строка, состоящая из произвольных символов. Найти символ, который встречается в ней чаще всего.";

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int count = 1;
        int max = 0;
        char c = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > max) {
                    c = arr[i];
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("Символ " + c + " повторяется " + max + " раз.");
    }
}
