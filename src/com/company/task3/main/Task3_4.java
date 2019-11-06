package com.company.task3.main;

public class Task3_4 {

    //3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    public static void solveTask3() {
        int d1 = Task1.calculateNod(125, 50);
        int d2 = Task1.calculateNod(15, 45);
        int d = Task1.calculateNod(d1, d2);
        System.out.println("3. d = " + d);
    }
    //4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
    public static void solveTask4() {
        int k1 = Task1.calculateNok(50, 15);
        int k = Task1.calculateNok(k1, 5);
        System.out.println("4. k= " + k);
    }
}
