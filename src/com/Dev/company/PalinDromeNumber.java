package com.Dev.company;

import java.util.Scanner;

public class PalinDromeNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reversedNumber = 0;

        while (temp>0){
            int lastDigit = temp%10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temp/= 10;
        }
        if (reversedNumber == n){
            System.out.println( n + "It is Palindrom number");
        }
        else
            System.out.println( n + "it is not a plindrum");

    }
}
