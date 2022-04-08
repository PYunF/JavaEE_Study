package com.itheima.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Snoopy
 * @date 2022-04-06  12:01
 */
public class mapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameMap = new HashMap<>();
        nameMap.put("张三", 23);
        nameMap.put("李四", 24);
        nameMap.put("王五", 25);
        nameMap.put("赵六", 26);

        Set<Map.Entry<String, Integer>> entrySet = nameMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("本次遍历获取的键是：" + key + "，获取到的值是：" + value);
        }
    }
}
