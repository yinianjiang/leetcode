package com.yinian.leetcode.list.arraylist;

import org.apache.naming.factory.BeanFactory;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Field;
import java.util.*;

public class Alist {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

    }

    public static void getCap() throws Exception{
        //可以在这里的构造函数来进行ArrayList初始容量的设定
        List<String> str=new ArrayList<String>();
        for (int i = 0; i < 11; i++) {
            str.add(String.valueOf(i));
        }
        Class<? extends List> strClass = str.getClass();
        Field field = strClass.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(str);

        System.out.println("这个ArrayList的容量为："+elementData.length+
                ",这个ArrayList中元素的个数为"+str.size());
    }
}
