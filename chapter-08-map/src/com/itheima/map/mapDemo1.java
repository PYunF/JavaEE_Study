package com.itheima.map;

import java.util.HashMap;

/**
 * @author Snoopy
 * @date 2022-04-06  10:10
 */
public class mapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameMap = new HashMap<>();

        Integer valueOne = nameMap.put("张三", 23);
        System.out.println("添加张三，23的时候返回，返回值ValueOf是：" + valueOne);

        nameMap.put("李四", 24);
        nameMap.put("田七", 27);
        Integer valueTwo = nameMap.put("张三", 25);
        System.out.println("添加张三，25的时候，返回值是：" + valueTwo);
        System.out.println("添加了数据之后，map的内容是：" + nameMap);

        Integer removeValueOne = nameMap.remove("田七");
        System.out.println("删除田七返回的被删除的键是：" + removeValueOne);
        System.out.println("删除了键值数据之后，map的内容是：" + nameMap);

        System.out.println("map中是否包含张三作为键：" + nameMap.containsKey("张三"));
        System.out.println("map中是否包含王五作为键：" + nameMap.containsKey("王五"));
    }
}
