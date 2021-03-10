package com.Dev.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
       Scanner Sc = new Scanner(System.in);

       System.out.println("Enter the First Number");
       int a = Sc.nextInt();

       System.out.println("Enter the Second Number");
       int b = Sc.nextInt();

       System.out.println("operation will be started");
        Sc.nextLine();



        char operation = Sc.nextLine().charAt(0);

        int result = 0;

        switch (operation){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;

            default:
                System.out.println("Not ab");
        }
        System.out.println("The ans is "+ result);

    }
}
