package com.xuecheng.manage_cms.Pipe;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void eat(){
        System.out.println(this.name +":eat....");
    }

    public void running(){
        System.out.println("running......");
    }
}