package com.beniregev.demos.multithreadingdemo1;

public class GetTheMailRunnable implements Runnable {
    private int startTime;

    public GetTheMailRunnable(int startTime) {
        this.startTime = startTime;
    }

    public void run() {
        try {
            Thread.sleep(startTime * 1000);
        } catch(InterruptedException e) {
            //   No need to actually do anything, just leave empty
        }
        System.out.println("Check Mail... (mock)");
    }
}
