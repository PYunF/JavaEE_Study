package com.itheima.overridemethod;

/**
 * @author Snoopy
 * @date 2022-03-26  15:24
 */
public class Test {
    public static void main(String[] args) {
        /*NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.show();*/

        Tiger tiger = new Tiger();
        tiger.setColor("黄色");
        tiger.setName("大黄");
        tiger.setAge(15);
        System.out.println(tiger.getName());
        System.out.println(tiger.getAge());
        System.out.println(tiger.getColor());
    }
}
