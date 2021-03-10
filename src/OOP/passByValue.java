package OOP;

public class passByValue {
    public static void main(String[] args){
        int c = 12;
        int d = 78;

        swap(c,d);
        System.out.println(c + " " +d);

    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
