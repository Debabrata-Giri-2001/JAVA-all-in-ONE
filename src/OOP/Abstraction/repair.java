package OOP.Abstraction;

public class repair {
    public static void repairCar(car Car){
        System.out.println("car is repaired");
    }
    public static void main(String[] args){

        BMW BMWcar = new BMW();
        audi audiCar = new audi();

        repairCar(BMWcar);
        repairCar(audiCar);
    }
}
