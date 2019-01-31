package com.beniregev.demos.multithreadingdemo1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime20Times extends Thread {
    public void run() {
        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormatter;
        DateFormat dateFormatter;
        String outputTime;
        String outputDate;

        for (int i=1; i <=20 ; i++) {
            rightNow = new Date();
            currentLocale = new Locale("en");

            timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
            dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);

            outputTime = timeFormatter.format(rightNow);
            outputDate = dateFormatter.format(rightNow);

            System.out.println(outputTime);
            System.out.println(outputDate);
            System.out.println("");

            try {
                Thread.sleep(2000);

            } catch(InterruptedException e) {
                //   No need to actually do anything, just leave empty
            }
        }

    }
}
