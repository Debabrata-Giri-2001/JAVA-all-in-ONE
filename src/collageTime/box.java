package collageTime;

import  java.awt.*;;
public class box {
    box(){
        Frame f  = new Frame();
        Button b = new Button("Click me");

        
        b.setBounds(30,40,80,50);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);



    }



    public static void main(String[] args){
        box f = new box();
    }
}
