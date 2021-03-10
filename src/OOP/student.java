package OOP;

public class student {

    private int age;
    private String Name;

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        if (age>20){
            System.out.println("You are not allowed");
        }else {
            this.age = age;
        }

    }
}
