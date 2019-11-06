package com.company.task3.main;

public class Task13_14 {
    public static void solveTask13() {
        //13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
        int n;
        n = 4567;

        formArray(n);
    }

    private static int findCounter(int n) {
        int counter;

        counter = 0;

        while (n > 0) {
            n /= 10;
            counter++;
        }
        return counter;
    }

    public static int[] formArray(int n) {
        int[] arr = new int[findCounter(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }

    public static void solveTask14() {
        //14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
        int n;
        int k;
        int[] a;
        int[] b;

        n = 1234;
        k = 6723;
        a = formArray(n);
        b = formArray(k);

        if (a.length > b.length) {
            System.out.println("more numbers in 1st");
        } else if (a.length > a.length) {
            System.out.println("more numbers in 2nd");
        } else {
            System.out.println("equals");
        }
    }
}
