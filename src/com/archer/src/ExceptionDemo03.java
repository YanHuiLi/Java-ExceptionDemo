package com.archer.src;

/**
 * Created by Archer on 2016/3/23.
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        try{
             throw  new Exception("实例化异常对象");
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
