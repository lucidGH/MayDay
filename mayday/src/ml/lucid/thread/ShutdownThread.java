package ml.lucid.thread;

import ml.lucid.os.shutdis;

public class ShutdownThread implements Runnable {
    public void run(){
        shutdis.disable();
    }
}
