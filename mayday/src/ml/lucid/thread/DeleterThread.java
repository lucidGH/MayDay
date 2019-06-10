package ml.lucid.thread;

import ml.lucid.misc.del;

public class DeleterThread implements Runnable {
    public void run(){
        del.deleter();
    }
}
