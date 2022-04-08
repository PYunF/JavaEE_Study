package com.itheima.map;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * @author Snoopy
 * @date 2022-04-06  15:11
 */
public class mapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("测试1", new Student("张三", 201, 95));
        studentHashMap.put("测试2", new Student("李四", 206, 100));
        studentHashMap.put("测试3", new Student("王五", 209, 75));
        studentHashMap.put("测试4", new Student("赵六", 203, 88));
        studentHashMap.forEach(new BiConsumer<String, Student>() {
            @Override
            public void accept(String s, Student student) {
                System.out.println("排序前为：" + s + "," + student);
            }
        });
        Set<Map.Entry<String, Student>> entries = studentHashMap.entrySet();
        ArrayList<Map.Entry<String, Student>> arrayList = new ArrayList<>();
        arrayList.addAll(entries);
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Student>>() {
            @Override
            public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
                return o2.getValue().getScore() - o1.getValue().getScore();
            }
        });
        LinkedHashMap<String, Student> studentLinkHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Student> stringStudentEntry : arrayList) {
            studentLinkHashMap.put(stringStudentEntry.getKey(),stringStudentEntry.getValue());
        }
        System.out.println("排序后：");
        studentLinkHashMap.forEach(new BiConsumer<String, Student>() {
            @Override
            public void accept(String s, Student student) {
                System.out.println(s + ", " + student);
            }
        });
    }

}
