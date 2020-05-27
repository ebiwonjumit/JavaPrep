package com.iheart.training;

public class PersonD {

    private String name;
    private int age;
    private String gender;
    private String address;

    public PersonD(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.age;
    }
}
