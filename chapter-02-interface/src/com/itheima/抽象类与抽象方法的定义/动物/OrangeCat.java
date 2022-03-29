package com.itheima.抽象类与抽象方法的定义.USB;

import com.itheima.抽象类与抽象方法的定义.动物.Cat;

/**
 * @author Snoopy
 * @date 2022-03-27  9:44
 */
public class OrangeCat extends Cat {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
