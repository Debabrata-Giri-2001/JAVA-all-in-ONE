package OOP.inheritance;

public class mainInheritance {
    public static void main(String[] args){

        teacher t1 = new teacher();
        singer s1 = new singer();
        parson p = t1;
        teacher t =(teacher) p;
        boolean OP = t1 instanceof teacher;

        System.out.println(t1 instanceof teacher);
        System.out.println(s1 instanceof singer);
        System.out.println(t1 instanceof parson);
        System.out.println(t instanceof parson);
        System.out.println(p instanceof teacher);

//        T.name = "Mr. inheritance";
//        T.eat();
//        T.walk();
//        T.teacher();
//
//        singer S = new singer();
//        S.name = "ED sharma";
//        S.walk();
//        S.eat();
//        S.singer();
    }
}
