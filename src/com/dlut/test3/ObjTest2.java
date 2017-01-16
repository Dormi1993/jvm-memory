package com.dlut.test3;

public class ObjTest2 {
    public static void changeObj(Person p) {
        p.setName("罗兵汉");
        p.setAge(18);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("叠罗汉");
        person.setSex("男");
        person.setAge(146);
        System.out.println(person);
        ObjTest2.changeObj(person);
        System.out.println(person);
    }
}
