package com.archer.src;

/**
 * Created by Archer on 2016/3/23.
 */


class Exc{
    int a=10;
    int b=10;
}

public class ExceptionDemo01 {
    public static void main(String[] args) {

        int temp = 0;
        Exc e=null;
        e=new Exc();
        try {
            temp=e.a/e.b;
            System.out.println(temp);
            //出现异常以后没办法成功退出了

        } catch (NullPointerException e1) {
            System.out.println("空指针异常"+e1);
        }catch (ArithmeticException e1){
            System.out.println("算术异常"+e1);

        }
        //finally不管异常还是不异常都是退出的
        finally {
            System.out.println("程序退出");
        }





    }
}
