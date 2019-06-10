package ml.lucid.thread;

import ml.lucid.tasker.task;

public class TaskThread implements Runnable{
    public void run(){
        task.taskstart();
        task.taskkill();
    }
}
