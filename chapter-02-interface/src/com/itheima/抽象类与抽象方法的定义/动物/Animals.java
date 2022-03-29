package com.itheima.抽象类与抽象方法的定义;

/**
 * @author Snoopy
 * @date 2022-03-27  9:40
 */
public abstract class Animals {
    private String name;
    private String age;

    public void sleep(){
        System.out.println("所有动物都会睡觉！！！");
    }

    public abstract void eat();

    public Animals() {
    }

    public Animals(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
