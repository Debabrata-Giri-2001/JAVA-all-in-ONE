package OOP;

public class method {
    public static void main(String[] args){
        int firstNumber = 45;
        int secondNumber = 12;
        int result = mxaOf(firstNumber,secondNumber);

        System.out.println(result);
        sayHi();
    }
    static int mxaOf(int a,int b){
        if(a>b){
            return a;
        }else
        return b;
    }
    static void sayHi(){
        System.out.println("Hiii..");
        System.out.println("Good Morning");

    }
}
