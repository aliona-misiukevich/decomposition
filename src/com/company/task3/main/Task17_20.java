package com.company.task3.main;

public class Task17_20 {
    //17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
    // Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
    public static void solveTask17() {
        int k = 407;

        for(int i = 1; i <= k; i++) {
            if (isArmstrong(i)) {
                System.out.println("17. the number = " + i);
            }
        }
    }

    public static int findCounter(int i){
        int s = 0;
        int counter = 0;

        while (i > 0) {
            int a = i % 10;
            s += a;
            i /= 10;
            counter++;
        }
        return counter;
    }

    public static boolean isArmstrong(int i) {
        int s = 0;
        int m = i;
        int counter = findCounter(m);

        while (i > 0) {
            int a = i % 10;
            i /= 10;

            int digitValue = (int) Math.pow(a, counter);
            s += digitValue;
        }
        return s == m;
    }

    //18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
    // Для решения задачи использовать декомпозицию.
    public static void solveTask18() {
        int n;
        n = 3;

        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n);

        int[] arr = new int[end - start + 1];
        for (int i = start; i < end; i++) {
            arr[i - start] = i;
            }
        }

    public static boolean isSequence(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            while (x > 0) {
                int newX = x % 10;
                int nextX = x / 10 % 10;
                if (newX < nextX) {
                    return false;
                }
            }
        }
        return true;
    }

    //19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    // Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
    public static void solveTask19() {
        // 10 - 99
        int n;
        n = 3;

        int start = (int)Math.pow(10, n-1);
        int end = (int)Math.pow(10, n);

        int[] arr = new int[end - start + 1];
        for(int i = start; i < end; i++){
            arr[i - start] = i;
        }

        int s = findSum(arr);
        int counter =findEven(s);

        System.out.println("19. s = " + s);
        System.out.println(counter);
    }

    public static boolean findOdd(int x) {
        while(x > 0) {
            int newX = x % 10;
            if (newX % 2 == 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public static int findSum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (findOdd(x)) {
                s += x;
            }
        }
        return s;
    }

    public static int findEven(int s) {
        int counter = 0;
        while (s > 0) {
            int newS = s % 10;
            if (newS == 0) {
                return counter;
            }
            if (newS % 2 == 0)  {
                counter++;
            }
            s /= 10;
        }
        return counter;
    }

    //20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    // Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
    public static void solveTask20() {
        int n;
        n = 152;

        int count = 0;
        while (n > 0) {
            n -= getDigitSum(n);
            count++;
        }

        System.out.println("Count is " + count);
    }


    private static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
