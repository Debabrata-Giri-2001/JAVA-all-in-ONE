package OOP;

class Box{
    private double width;
    private double height;
    private double depth;

    Box(Box ob){
        width  = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w,double h,double d){
    width = w;
    height = h;
    depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    double Volume(){
        return width*height*depth;
    }

}
class BoxWeight extends Box{
    double Weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        Weight = ob.Weight;
    }
    BoxWeight(double w,double h,double d,double m){
        super(w, h, d);
        Weight = m;
    }
    BoxWeight(){
        super();
        Weight = -1;
    }
    BoxWeight(double len,double m){
        super(len);
        Weight = m;

    }
}

public class demoSuper {
public static void main(String[] args){
    BoxWeight myBox1 = new BoxWeight(2,4,5,0.045);
    BoxWeight myBox2 = new BoxWeight(20,12,15,0.012);
    BoxWeight myBox3 = new BoxWeight();
    BoxWeight myCube = new BoxWeight(3,5);
    BoxWeight myClone = new BoxWeight(myBox1);
    double vol;

    vol = myBox1.Volume();
    System.out.println("Volume of my box" + vol);
    System.out.println("Weight of myBox" +  myBox1.Weight);
    System.out.println();

    vol = myBox2.Volume();
    System.out.println("Volume of my Box is"+ vol);
    System.out.println("Weight of myBox " +  myBox2.Weight);
    System.out.println();

    vol = myCube.Volume();
    System.out.println("Volume of myCube"+ myCube);
    System.out.println("Weight of myCube" + myCube.Weight);
    System.out.println();

    vol = myClone.Volume();
    System.out.println("Volume of myClone"+ myCube);
    System.out.println("Weight of myClone" + myClone.Weight);
    System.out.println();
    }
}
