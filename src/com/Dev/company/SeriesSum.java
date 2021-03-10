package com.Dev.company;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//
//        float result = 0 ;
//
//        for (float i = 1; i<=n; i++ ){
//
//            result = 1/i;
//        }
//        System.out.println(result);

        float result = 0;

        for (float i = 1; i<=n; i++){

            if (i % 2 == 0){
                result -=1/i;
            }
            else {
                result +=1/i;
            }
        }
        System.out.println(result);
    }
}

/*
Q.
The Question is sum of n number series like

1/1
+
1/2
+
1/3
+
..........................1/n

*/
