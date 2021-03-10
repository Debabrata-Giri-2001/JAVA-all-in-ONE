package OOP;

class cat{
    boolean hasFor;
    String color,breed;
    int leg,eye;

    public void walk(){
        System.out.println("cat is walking");
    }
    public void eat(){
        System.out.println("cat is Eating");
    }
    public void description(){
        System.out.println("My cat has " + leg +" leg and " +eye+" eye");
    }
}
class dog{
    boolean dog;
    String color,breed,name;
    int leg,eye;

    public void name(){
        System.out.println("My dog name is KUTA");
    }

    public void description1(){
        System.out.println("my Dog is domestic animal " + dog +" and color is "+ color + " and is "+ breed +" and my pate dog name is "+ name + " he is total "+ leg +" leg  and "+  eye+" eye is so cute");
    }
}
public class Object {
    public static void main(String[] args){
        /*
        cat Cat1 = new cat();
        cat Cat2 = new cat();
       // Cat2.eat();
        //Cat1.walk();
        Cat1.leg = 3;
        Cat1.eye = 2;
        Cat1.description();
        Cat2.description();

         */

        dog Dog1 = new dog();
        Dog1.name();

        Dog1.dog =  true;
        Dog1.color = "red";
        Dog1.breed = "breed";
        Dog1.name = "kuta";
        Dog1.leg = 5;
        Dog1.eye =  2;

        Dog1.description1();
    }
}
