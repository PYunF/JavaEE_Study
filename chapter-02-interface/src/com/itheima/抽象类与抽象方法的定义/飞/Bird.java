package com.itheima.抽象类与抽象方法的定义;

/**
 * @author Snoopy
 * @date 2022-03-27  11:40
 */
public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("小鸟展开翅膀飞！！！");
    }
}
