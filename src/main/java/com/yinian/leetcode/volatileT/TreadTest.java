package com.yinian.leetcode.volatileT;

public class TreadTest {
    public static void main(String[] args) {
        System.out.println("[main] execute");
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("[thread] execute RUN");
    }

    @Override
    public void start() {
        System.out.println("[method] execute RUN");
    }
}
