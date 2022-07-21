package com.yinian.leetcode.ssm.spring;

import com.yinian.leetcode.entity.User;

import java.util.concurrent.atomic.AtomicReference;

public class T {

    public static void main(String[] args){
        User u1  = new User("zhang",1);
        User u2  = new User("li",3);
        AtomicReference<User> atomicReference = new AtomicReference<User>();
        atomicReference.set(u1);
        System.out.println( atomicReference.compareAndSet(u1,u2)+"ao"+atomicReference.get());
    }
}
