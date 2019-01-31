package com.beniregev.demos.multithreadingdemo1;

public class LessonJavaMultiThreading {
    public static void main(String[] args) {
        Thread getTime = new GetTime20Times();

        Runnable getMail = new GetTheMailRunnable(10);
        Runnable getMailAgain = new GetTheMailRunnable(20);

        getTime.start();

        new Thread(getMail).start();
        new Thread(getMailAgain).start();
    }
}
