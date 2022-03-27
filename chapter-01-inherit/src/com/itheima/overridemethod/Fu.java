package com.itheima.overridemethod;

/**
 * @author Snoopy
 * @date 2022-03-26  15:05
 */
public class Fu {
    void show(){
        System.out.println("fu类的show方法");
    }
}
class Zi extends Fu{
    //注解可以帮忙检验该方法是否可以满足重写的条件
    @Override
    void show(){
        System.out.println("子类增强父类方法1");
    }
}
class test{
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}
