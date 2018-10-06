package com.bijo.learning.utilpackage.otherclasses;

import java.util.Timer;
import java.util.TimerTask;

public class Lab680 {
    public static void main(String[] args) {
        System.out.println("About to schedule a task:");
        new Reminder(5);
        System.out.println("Task scheduled");
    }
}
class Reminder{
    Timer timer;
    public Reminder(int seconds){
        timer=new Timer();
        timer.schedule(new ReminderTask(),seconds*1000);
    }

    class ReminderTask extends TimerTask{
        public void run(){
            System.out.println("Time's UP!");
            timer.cancel();
        }
    }
}
