package OOP;

public class staticKeyword {

    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
    public static void main(String[] args){

            System.out.println("Block is inSide");


        A objA = new A();
        A.B objB = objA.new B();

        A.C objC = new A.C();
    }
    static {
        System.out.println("Block 3");
    }
}
