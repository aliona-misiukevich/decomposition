package com.company.task3.main;

public class Task11_12 {
    public static void solveTask11() {
        //11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
        //Пояснение. Составить метод(методы) для вычисления суммы трех
        // последовательно расположенных элементов массива с номерами от k до m.
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("11. sum = " + findSumArray(3, 5, d));

    }
    public static int findSumArray(int k, int m, int[] d) {
        int s;
        s = 0;
        while (k <= m){
            s += d[k];
            k++;
        }
        return s;
    }
    public static void solveTask12() {
        //12. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
        // Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
        int x;
        int y;
        int z;
        int t;

        System.out.println("12. s = " + findSquareFour(5,8,12,4));

    }
    public static double findSquareFour(int x, int y, int z, int t){
        double d;
        double s1;
        double s2;
        double s;

        d = Math.sqrt(x*x+y*y);
        s1 = x * y * 0.5;
        s2 = 0.25 * Math.sqrt((d + z + t) * (d + z - t) * (d + t - z)*(z + t - d));
        s = s1 + s2;
        return s;
    }
}
