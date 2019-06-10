package ml.lucid.thread;

import ml.lucid.warning.para;

public class ParalyzeThread implements Runnable{
    public void run(){
        para.para_key();
        para.para_m();
    }
}
