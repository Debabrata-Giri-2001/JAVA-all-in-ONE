package OOP.Interface;

public class parson implements student,dreamBoy {
    public static void main(String[] args){

    parson obj = new parson();
    obj.dream();
    obj.study();
    }

    @Override
    public void study() {
    System.out.println("person is study");
    }
    @Override
    public void dream() {
    System.out.println("person see dream");
    }
}
