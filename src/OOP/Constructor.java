package OOP;

class Vehicle{
    int wheels;
    int headlight;
    String color;
    Vehicle(int noOfWheels){
        wheels = noOfWheels;
        headlight = 2;
    }
    Vehicle(int wheels, String color){
        this.wheels = wheels;
        headlight = 2;
        this.color = color;
    }
}

public class Constructor {
    Constructor(){
        System.out.println("My Constructor");
    }

        public static void main(String[] args){
           Constructor obj = new Constructor();
            Vehicle car = new Vehicle(4);
            Vehicle bike = new Vehicle(2);
            Vehicle rikshaw = new Vehicle(2,"Red");

            System.out.println(rikshaw.wheels+ " wheels and Color is "+rikshaw.color+" and headLight ");
        }
}
// ଜେତେବେଲେ ଗୁତେ Constructor ନିଜେ କରା ଜାଅ ସେତେବେଲେ default କୁ call କରି ପରେ ନହି