package com.itheima.抽象类与抽象方法的定义;

/**
 * @author Snoopy
 * @date 2022-03-27  12:12
 */
public class KeyBoard implements USB {

    @Override
    public void start() {
        System.out.println("插入键盘");
    }

    @Override
    public void run() {
        System.out.println("开始输入代码");
    }

    @Override
    public void stop() {
        System.out.println("收拾键盘");
    }
}
