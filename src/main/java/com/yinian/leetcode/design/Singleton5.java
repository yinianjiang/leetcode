package com.yinian.leetcode.design;

public class Singleton5 {
    private static Singleton5 instance;
    public static Singleton5 singleton5(){
        synchronized(Singleton5.class){
            if(instance == null){
                instance = new Singleton5();
            }
            return instance;
        }
    }
}
