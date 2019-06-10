package ml.lucid.warning;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class warning {

    public static void warn() throws Exception{
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel txtlabel = new JLabel("You're infected with mayday virus!", SwingConstants.CENTER);
        txtlabel.setPreferredSize(new Dimension(300,100));
        frame.getContentPane().add(txtlabel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        TimeUnit.SECONDS.sleep(5);

        frame.setVisible(false);
    }
    public static void mouse_warn() {
        JFrame frame = new JFrame("");

        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point pointLoc = pointerInfo.getLocation();
        int x_loc = (int) pointLoc.getX();
        int y_loc= (int) pointLoc.getY();

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JLabel txtlabel = new JLabel(   "stop me.\n by lucid", SwingConstants.CENTER);
        frame.setPreferredSize(new Dimension(30,30));
        frame.getContentPane().add(txtlabel, BorderLayout.CENTER);

        frame.setLocation(x_loc + 1, y_loc + 1);
        frame.pack();
        frame.setVisible(true);
    }
    public static void warn_all()throws Exception{
        warn();
        TimeUnit.SECONDS.sleep(5);
        while(true) {
            mouse_warn();
        }
    }
}
