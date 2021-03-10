package HackerRankQ;

import java.util.Scanner;

public class just {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double mealCost = scan.nextDouble(); // original meal price
//        int tipPercent = scan.nextInt(); // tip percentage
//        int taxPercent = scan.nextInt(); // tax percentage
//        scan.close();
//
//        double tip = mealCost * tipPercent / 100;
//        double tax = mealCost * taxPercent / 100;
//        double total = mealCost + tip + tax;
//
//        //cast the result of the rounding operation to an int and save it as totalCost
//        int totalCost = (int) Math.round(total);
//
//        // Print your result
//        System.out.println("The total meal cost is " + totalCost + " dollars.");
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double meal_cost = scanner.nextDouble();
//        int tip_percent = scanner.nextInt();
//        int tax_percent = scanner.nextInt();
//        scanner.close();
//        double tip = meal_cost*tip_percent/100;
//        double tax = tax_percent*tip_percent/100;
//
//        double total = meal_cost + tip + tax;
//
//        int totalOP = (int)Math.round(total);
//
//        System.out.println(totalOP);
//
//    }
/*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }

*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (isPrime(sc.nextInt()))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;



    }
}


