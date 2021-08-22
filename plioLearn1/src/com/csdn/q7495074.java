package com.csdn;

import java.util.Scanner;

public class q7495074 {
    final static int max_num = 10;

    public static void main(String[] args) {
        int[] a = new int[max_num];
        Scanner input = new Scanner(System.in);
        System.out.println("输入初始数组元素个数");
        int count = input.nextInt();
        System.out.println("输入数据");
        for (int i = 0; i < count; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("数据输入成功\n请键入插入值与相对位置");
        if (count == 0 || count == max_num) {
            if (count == 0) {
                System.out.println("数组为空!\n");
            } else {
                System.out.println("数组已满!\n");
            }
        } else {//第二步
            Scanner operator = new Scanner(System.in);
            int new_data = operator.nextInt();//k
            int index = operator.nextInt();//目标数据
            for (int i : a) {//检测k的重复
                if (new_data == i) {
                    System.out.println("k已经存在!");
                    return;
                }
            }
            boolean flag = true;
            for (int i = (count - 1); i >= 0; i--) {
                if (a[i] == index) {
                    flag = false;
                    System.arraycopy(a, i + 1, a, i + 2, count - i - 1);
                    a[i + 1] = new_data;
                    System.out.println("替换成功!");
                    break;
                }
            }
            if (flag) {
                System.out.println("目标数据不存在!");
                return;
            }
            for (int i = 0; i < count + 1; i++) {
                System.out.print(a[i]);
                System.out.print(" ");
            }


        }

    }
}

