package com.Dev.company;

public class NestedIfElse {
    public static void main(String[] args) {
        int a = 1, b = 75, c = 5;
        int result = 0;

        result = a>b ? a>c? a:c : b>c ? b:c ;

//        if (a > b) {
//            if (a > c) {
//                result = a;
//            } else {
//                result = c;
//            }
//        }
//            else{
//                if (b > c) {
//                    result = b;
//                } else {
//                    result = c;
//                }
//            }




        System.out.println("Max value is"+ result);

    }

}
