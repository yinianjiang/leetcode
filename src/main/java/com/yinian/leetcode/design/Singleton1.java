package com.yinian.leetcode.design;

/**
 * 直接实例化饿汉式
 */
public class Singleton1 {
    private Singleton1(){

    }
    public static final Singleton1 singleton1 = new Singleton1();
}
