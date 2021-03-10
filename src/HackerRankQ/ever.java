package HackerRankQ;

public class ever {
/*
    import java.util.Scanner;

    public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            double y = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();
            System.out.println("String: " + s);
            System.out.println("Double: " + y);
            System.out.println("Int: " + x);
        }
    }*/
    /*

  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}
*/

            /*import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                 if(x>=-32768 && x<=32767)System.out.println("* short");
                 if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)System.out.println("* int");
                 if(x>=-Math.pow(2,63) && x<=Math.pow(2,63)-1)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
*/
    /*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext())
        {
            System.out.println(i+" "+sc.nextLine());
            i++;
        }
    }
}*/

    //How to convert str to int in java
    //1.String s = String .valueOf(int obj);
    // OR
    //String s = "" + n ;

    /*
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
System.out.println((N%2==1 || (N>=6 && N<=20))?"Weird" : "Not Weird");

        scanner.close();
    }
}
*/
}
