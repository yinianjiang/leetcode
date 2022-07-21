package com.yinian.leetcode.volatileT;

import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        boolean b = atomicInteger.compareAndSet(5, 2019);
        System.out.println(b+"==》"+atomicInteger);

        System.out.println(b+"==》"+atomicInteger);

    }
}
