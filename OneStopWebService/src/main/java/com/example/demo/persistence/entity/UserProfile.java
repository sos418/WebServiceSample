package com.example.demo.persistence.entity;

public class UserProfile {

    private final long id;
    private final String name;
    private final int age;

    public UserProfile(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return name;
    }

    public int getAge(){
        return age;
    }
}
