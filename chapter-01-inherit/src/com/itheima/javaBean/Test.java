package com.itheima.javaBean;

/**
 * @author Snoopy
 * @date 2022-03-26  10:28
 */
public class Test {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher();
        javaTeacher.name = "王五";
        javaTeacher.age = 16;
        javaTeacher.show();

        PythonTeacher pythonTeacher = new PythonTeacher();
        pythonTeacher.name = "张三";
        pythonTeacher.age = 19;
        pythonTeacher.show();
    }
}
