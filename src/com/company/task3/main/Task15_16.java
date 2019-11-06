package com.company.task3.main;

import java.util.ArrayList;
import java.util.List;

public class Task15_16 {
    public static void solveTask15() {
//15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

        int n;
        int k;

        n = 100;
        k = 14;

    }

    public static int findArrayLength(int n, int k) {
        int length = 0;
        for (int i = 1; i <= n; i++) {
            int[] arr;
            arr = Task13_14.formArray(i);
            int s;
            s = findSum(arr);
            if (s == k) {
                length++;
            }
        }
        return length;
    }

    public static int[] findArrayWithConditions(int n, int k) {
        int[] arr = new int[findArrayLength(n, k)];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            arr = Task13_14.formArray(i);
            int s;
            s = findSum(arr);
            if (s == k) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }

    public static int findSum(int[] arr) {
        int s;
        s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    public static void solveTask16() {
        //16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
        // Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
        // Для решения задачи использовать декомпозицию.
        int n = 30;
        int start = n;
        int end = 2 * n;

        for (int i = start; i <= end - 2; i++) {
            if(isPrime(i) && isPrime(i+2)) {
                System.out.println("16. prime pair " + i + " and " + (i+2));
            }
        }
    }

    public static boolean isPrime(int a) {
        for(int i = 2; i <= a / 2; i++) {
            if(a % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
