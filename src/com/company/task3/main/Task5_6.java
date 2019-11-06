package com.company.task3.main;

public class Task5_6 {
    //5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
    //10, 20, 30

    public static void solveTask5() {
        int s = findSmallest(10, 20, 30) + findBiggest(10, 20, 30);
        System.out.println("5. sum = " + s);
    }

    public static int findSmallest(int a, int b, int c) {
        int s = b;

        if (a < s) {
            s = a;
        }

        if (c < s) {
            s = c;
        }
        return s;
    }

    public static int findBiggest(int a, int b, int c) {
        int h = b;

        if (a > h) {
            h = a;
        }
        if (c > h) {
            h = c;
        }
        return h;
    }
    //6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
    public static void solveTask6() {
        double s;

        s = 6 * findSquare(5);
        System.out.println("6. square = " + s);
    }

    public static double findSquare(int a) {
        double s1;

        s1 = Math.sqrt(3) / 4 * a * a;
        return s1;
    }

}
