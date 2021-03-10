package HackerRankQ;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char bate = sc.next().charAt(0);

        if (bate == 'a' || bate == 'e' || bate == 'i'|| bate == 'o' || bate == 'u') {
            System.out.println("Given ch is  vowel ");
        }
        else{
                System.out.println("Given ch is consonant");
            }
        }
    }
