package com.plio;

public class Person {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(36);
        System.out.printf("%d\t%d\n", Demo.st,d2.src);
    }
}

class Demo {
    static int st = 130;
    int src;

    public Demo() {
        this.src = 10;
    }public Demo(int src) {
        this.src = src;
    }
}