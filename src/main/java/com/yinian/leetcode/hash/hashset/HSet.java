package com.yinian.leetcode.hash.hashset;

import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        boolean name1 = hs.add("name1");
        System.out.println(name1);
        System.out.println(hs.add("name1"));
    }
}
