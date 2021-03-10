package collageTime;

import java.awt.*;
import java.time.Duration;

public class beepSound {

    public static void main(String[] args){
        
        Toolkit.getDefaultToolkit().beep();
        Duration beepSoundD = Duration.ofSeconds(50);
        
    }
}
