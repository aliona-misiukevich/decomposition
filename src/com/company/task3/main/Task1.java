package com.company.task3.main;

public class Task1 {
    public static void solveTask1() {
        //1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

        double s = calculateSquare(1, 3, 6, 3, 8, 4);
        System.out.println("1. s = " + s);
    }

    private static double calculateSquare(int x1, int x2, int x3, int y1, int y2, int y3) {
        return 0.5 * Math.abs((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3));
    }

    //2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
    // АВ  НОК(А,В) = НОД(А,В)
    // 
    public static void solveTask2() {

        double c = calculateNod(9,12) * calculateNok(9, 12);
        System.out.println("2. c = " + c);
    }

    public static int calculateNod(int a, int b) {
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            d = a + b;
        }
        return d;
    }
    public static int calculateNok(int a, int b){
        int k;
        k = a * b / calculateNod(a, b);
        return k;
    }
}
