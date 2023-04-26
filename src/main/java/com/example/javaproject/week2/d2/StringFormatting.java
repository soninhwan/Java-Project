package com.example.javaproject.week2.d2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "김기성";
        int balance = 120_000_0000;
        String message = name + "님의 통장 잔고는 " + balance + "원입니다.";
        System.out.println(message);
    }
}