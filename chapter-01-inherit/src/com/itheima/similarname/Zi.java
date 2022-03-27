package com.itheima.similarname;

/**
 * @author Snoopy
 * @date 2022-03-26  11:41
 */
public class Zi extends Fu {
    public static void main(String[] args) {
        Zi zi = new Zi();
       // zi.show();
    }
    int num = 66;
    void show(){
        int num = 99;
        System.out.println("子类的访问方法");
    }
}
