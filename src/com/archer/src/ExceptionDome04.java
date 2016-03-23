package com.archer.src;

/**
 * Created by Archer on 2016/3/23.
 */

class MyException extends  Exception{
    MyException(String msg){
        super(msg);
    }

}
public class ExceptionDome04 {
    public static void main(String[] args) {

        try {
            throw new MyException("自定义异常");
        } catch (MyException e) {
            System.out.println(e);

        }

    }
}
