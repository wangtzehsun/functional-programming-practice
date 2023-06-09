package com.example.functionalprogramming.components;

import com.example.functionalprogramming.ImperativeVSDeclarative;

public class Person {
    public final String name;
    public final Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

}
