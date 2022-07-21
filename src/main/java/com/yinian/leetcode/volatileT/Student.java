package com.yinian.leetcode.volatileT;

import ch.qos.logback.core.util.TimeUtil;
import lombok.Data;
import lombok.Synchronized;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public class Student {
    volatile int age = 0;
    AtomicInteger automic = new AtomicInteger();

    public void add(){
        this.age = 60;
    }
    public void addPlus(){
       age++;
    }
    public void automic(){
        automic.getAndIncrement();
    }


    /**
     * 验证可见性
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Student s = new Student();
        for (int i = 0; i < 20 ; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    s.addPlus();
                    s.automic();
                }
            },String.valueOf(i)).start();
        }
        while(Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println("zuizhong"+s.getAge());
        System.out.println("zuizhong"+s.automic);

    }

    public void test(){
        int a = 10;
        System.out.println("Main-a:"+a);
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("执行Runnable1中打印线程名:"+Thread.currentThread().getName());
            }
        });
        thread.setName("自定义Thread");
        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("执行Runnable2中打印线程名:"+Thread.currentThread().getName());
            }
        });
        thread2.setName("自定义Thread2");
        thread2.run();

        System.out.println("执行Main中打印线程名:"+Thread.currentThread().getName());

    }
}
