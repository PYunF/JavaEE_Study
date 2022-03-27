package com.itheima.overridemethod;

/**
 * @author Snoopy
 * @date 2022-03-26  15:23
 */
public class NewPhone extends OldPhone {

    @Override
    void show() {
        super.show();
        System.out.println("可以视频");
        System.out.println("触摸屏");
    }
}
