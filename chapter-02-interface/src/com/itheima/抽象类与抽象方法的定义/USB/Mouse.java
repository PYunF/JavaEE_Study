package com.itheima.抽象类与抽象方法的定义;

/**
 * @author Snoopy
 * @date 2022-03-27  12:09
 */
public class Mouse implements USB {
    @Override
    public void start() {
        System.out.println("鼠标插入到usb接口中，开始安装默认的驱动程序");
        System.out.println("驱动程序安装完毕，可以开始使用鼠标");
    }

    @Override
    public void run() {
        System.out.println("单击打开idea");

    }

    @Override
    public void stop() {
        System.out.println("关闭idea");
    }
}
