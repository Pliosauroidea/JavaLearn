package com.csdn;

public class string_test {
    public static void main(String[] args) {
        String s3 = new String("11");
        s3.intern();
        String s4 = "11";
        System.out.println(s3.equals(s4));
    }
}
