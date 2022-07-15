package com.yinian.leetcode.design;

public class Singleton3 {
    /**
     * 静态代码块
     */
    public static final Singleton3 INSTANCE;
    private String info;
    static {
        try {
            INSTANCE = new Singleton3("123");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    private Singleton3(String info) {
        this.info = info;
    }
}
