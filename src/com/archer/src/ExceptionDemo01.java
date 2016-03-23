package com.archer.src;

/**
 * Created by Archer on 2016/3/23.
 */


class Exc{
    int i=10;
}

public class ExceptionDemo01 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int temp = 0;

        try {
            temp = a/b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(temp);

    }
}
