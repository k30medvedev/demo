package com.company;


public class MyThread4 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from my Thread 4");
        }
    }
}