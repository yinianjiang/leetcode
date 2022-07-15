package com.yinian.leetcode.design;

public class Singleton4 {
    private static Singleton4 instance;
    public static Singleton4 singleton4(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
