package com.example.javaproject.week1.d5;

public class User {
    // 이름, 전화번호, 나이
    String name;
    String phoneNumber;
    int age;
    boolean isAdult(){
        return age >= 18;
    }
}