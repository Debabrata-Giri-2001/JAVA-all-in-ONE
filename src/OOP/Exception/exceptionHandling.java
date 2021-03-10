package OOP.Exception;

public class exceptionHandling {
    public static void main(String[] args){
    try {
        int a = 45;
        int b = 0;
        int c = a/b;
        System.out.println(c);
        } catch (ArithmeticException d){
        System.out.println(d.getMessage()+" pleas check it");
        }
    }
}
