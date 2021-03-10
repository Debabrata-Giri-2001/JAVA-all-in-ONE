package com.Dev.company;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n- i+1; j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

/*
        pattern 2 is equal to patten 4
*/