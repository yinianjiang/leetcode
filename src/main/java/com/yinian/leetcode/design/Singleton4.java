package com.yinian.leetcode.design;

public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){
        System.out.println(Thread.currentThread().getName()+"执行构造器");
    }
    public static Singleton4 getSingleton4(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100 ; i++) {
            new Thread(()->{
                Singleton4.getSingleton4();
            },String.valueOf(i)).start();
        }
    }
}
