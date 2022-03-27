package com.itheima.overridemethod;

/**
 * @author Snoopy
 * @date 2022-03-26  15:22
 */
public class OldPhone  {
    void call(){
        System.out.println("手机可以在有话费的情况下接打电话");
    }
    void sendMessage(){
        System.out.println("手机可以在有话费的情况下收发短信");
    }
    void show(){
        System.out.println("叮铃铃~来电话了");
    }
}
