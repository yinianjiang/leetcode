package com.yinian.leetcode.copy.quote;

public class QuoteCopy {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("riemann", 28);
        Teacher otherTeacher = teacher;
        System.out.println(teacher);
        System.out.println(otherTeacher);
    }
}

class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int getHash(){
        return  this.hashCode();
    }
}
