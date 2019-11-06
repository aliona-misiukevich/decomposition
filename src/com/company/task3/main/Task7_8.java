package com.company.task3.main;

import java.util.Scanner;

public class Task7_8 {
    public static void solveTask7() {
        //7. На плоскости заданы своими координатами n точек. Написать метод(методы),
        // определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
        int n = 5;

        int[][] mas = {{2, 4}, {6, 7}, {9, 1}, {3, 5}, {7, 8}};

        double a = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (i == j){
                    continue;
                }
                double l;

                l = Math.sqrt((Math.pow((mas[i][j] - mas[i + 1][j]), 2) + Math.pow((mas[i][j] - mas[i][j + 1]), 2)));

                a = l;
            }
        }
    }

    //8. Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
    public static void solveTask8() {

        int[] mas = {3, 1, 5, 7, 3};
        System.out.println("8. second max = " + findMax(mas));
    }

    public static int findMax(int[] mas) {
        int largest;
        int secondLargest;

        if (mas[0] > mas[1]) {
            largest = mas[0];
            secondLargest = mas[1];
        } else {
            largest = mas[1];
            secondLargest = mas[0];
        }

        for (int i = 2; i < mas.length; i++) {
            if ((mas[i] <= largest) && mas[i] > secondLargest) {
                secondLargest = mas[i];
            }

            if (mas[i] > largest) {
                secondLargest = largest;
                largest = mas[i];
            }
        }
        return secondLargest;
    }
}
