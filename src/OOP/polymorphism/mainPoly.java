package OOP.polymorphism;

public class mainPoly {
    public static void main(String[] args){
        dog D = new dog();
        pet P = D;
        //animal A = D;

        D.walk();
        P.walk();
        System.out.println(D.name);
        System.out.println(P.name);

    }
    public void say(){
        System.out.println("Hi..,");
    }                               //line 13 and 15 these are cold methodOverLoading para miter is deferent
    public void say(String a){

    }
}
