package com.itheima.map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Snoopy
 * @date 2022-04-06  11:01
 */
public class mapDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要统计的字符串：");
        String str = sc.nextLine();
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (countMap.containsKey(ch)){
                Integer oldCount = countMap.get(ch);
                int newCount = oldCount + 1;
                countMap.put(ch,newCount);
            }else {
                countMap.put(ch,1);
            }
        }
        System.out.println("countMap中的内容是：" + countMap);
    }
}
