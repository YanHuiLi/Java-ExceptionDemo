package com.archer.src;

/**
 * Created by Archer on 2016/3/23.
 */
public class ExceptionDemo02  {
    public static void main(String[] args) {

       //在tell方法中抛出异常由main函数当中处理，在main函数中抛出异常，由jvm去处理
        try {
            tell(10,0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    private  static  void tell(int i ,int j) throws ArithmeticException{
        int temp;
        temp =i/j;
        System.out.println(temp);

    }
}
