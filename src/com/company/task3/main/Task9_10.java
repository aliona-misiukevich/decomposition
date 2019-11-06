package com.company.task3.main;

public class Task9_10 {
    //9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void solveTask9() {

        int d1 = Task1.calculateNod(3, 7);
        int d2 = Task1.calculateNod(7, 2);
        if (d1 == 1 && d2 == 1) {
            System.out.println("9. числа взаимно простые");
        }
    }

    public static void solveTask10() {
        //10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int s;
        s = 0 ;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                int a;
                a = n[i];
                s += findFactorial(a);
            }

        }
        System.out.println("10. sum = " + s);
    }

    public static int findFactorial(int a) {
        int f = 1;
        while (a != 0) {
            f *= a;
            a--;
        }
        return f;
    }
}
