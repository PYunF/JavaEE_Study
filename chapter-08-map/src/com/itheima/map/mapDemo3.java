package com.itheima.map;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Snoopy
 * @date 2022-04-06  11:27
 */
public class mapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameMap = new HashMap<>();
        nameMap.put("张三", 23);
        nameMap.put("李四", 24);
        nameMap.put("王五", 25);
        nameMap.put("赵六", 26);

        Set<String> keySet = nameMap.keySet();
        for (String s : keySet) {
            Integer integer = nameMap.get(s);
            System.out.println("本次获取到的key" + s + "，本次获取到的值是：" + integer);
        }
    }
}
