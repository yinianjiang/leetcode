package com.yinian.leetcode.volatileT;

public class ReSort {

    int  a = 0;
    boolean flag = false;
     public void methoed1(){
         flag =  true;
         Thread.yield();
          a = 1;
     }

     public void methoed2(){
         if(flag){
             a = a + 5;
             System.out.println(a);
         }
     }

    public static void main(String[] args) {
        for (int i = 0; i < 1000 ; i++) {
            ReSort s = new ReSort();
            new Thread(()->{
                s.methoed1();
            }).start();
            new Thread(()->{
                s.methoed2();
            }).start();
        }

     }
}
