package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[]{1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2};
        int summ = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            summ = summ + arr[i];
        }

        System.out.println("Сумма - " + summ);

    }
}


