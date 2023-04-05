package com.katalon.demo.certification.co.utils;

public class Wait {
    public static void Time(int mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

