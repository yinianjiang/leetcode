package com.yinian.leetcode.copy.object;

public class ObjectCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher("riemann", 28);
        Teacher otherTeacher = (Teacher) teacher.clone();
        System.out.println(teacher);
        System.out.println(otherTeacher);
    }
}

class Teacher implements Cloneable {
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

    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}
