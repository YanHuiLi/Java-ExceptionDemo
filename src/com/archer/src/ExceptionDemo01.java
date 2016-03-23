package com.archer.src;

/**
 * Created by Archer on 2016/3/23.
 */


class Exc{
    int i=10;
}

public class ExceptionDemo01 {
    public static void main(String[] args) {
     Exc e=null;
//        e=new Exc();
        System.out.println(e.i);
    }
}
