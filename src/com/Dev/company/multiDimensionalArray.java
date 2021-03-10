package com.Dev.company;

import java.util.Scanner;

public class multiDimensionalArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The value");

        int rows = sc.nextInt();
        int collum = sc.nextInt();

        int A[][] = new int[rows][collum];
        int B[][] = new int[rows][collum];

        System.out.println("Enter value Array 'A' ");

        for (int i=0; i<rows; i++) {
            for (int j=0; j<collum; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter value Array 'B' ");

        for (int i=0; i<rows; i++) {
            for (int j=0;j<collum; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int C[][] = new int[rows][collum];

        for (int i=0;i<rows; i++) {
            for (int j = 0; j <collum; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.print("Result of Array C is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < collum; j++)
                System.out.print (C[i][j] + " ");
        }


    }
}


//        int a[][] = new int [5][3];
//        System.out.println(a[1][2]);

//        int b[][] = {
//                {1,12,12,124,45,},
//                {4,457,78,54,8},
//                {7,8,6,4,7,78,}
//                    };
//        System.out.println(b[2][4]);





