package com.Dev.company;

import java.util.Scanner;

public class classAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Student: ");

        int n = sc.nextInt();

        int mark[] = new int[n];

        System.out.println("Enter The mark: ");

        for (int i= 0; i<n; i++){

            mark[i] = sc.nextInt();
        }

        int averageMark = 0;

        for (int i=0; i<n; i++){

            averageMark += mark[i];
        }

        averageMark /= n;

        System.out.println("The average mark is:"+ averageMark);
    }
}
