package ml.lucid.thread;

import ml.lucid.corruption.corruption;

public class CorruptionThread implements Runnable {
    public void run(){
        corruption.corrupt();
    }

}