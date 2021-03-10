package com.Dev.company;

import java.util.Scanner;

public class AdvancePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();

        int number = 1;
        for (int i = 1 ; i<= n; i++){
            for (int j= 1; j<=i-1; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=n-i+1;j++){
                System.out.print(number++ +" ");
                number++;
            }
            System.out.println();
        }


//        for (int i = 1 ; i<= n; i++){
//            for (int j= 1; j<=i-1; j++) {
//                System.out.print(" ");
//            }
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print(" X ");
//            }
//            System.out.println();
//        }
    }
}
