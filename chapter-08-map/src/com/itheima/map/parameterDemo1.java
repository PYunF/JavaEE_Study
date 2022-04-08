package com.itheima.map;

/**
 * @author Snoopy
 * @date 2022-04-06  16:21
 */
public class parameterDemo1 {
    public static void main(String[] args) {
        getElementSum();
        getElementSum(10, 20, 55, 44, 96, 23);
    }
    public static void getElementSum(int...arr){
        System.out.println("本次传递的多个参数封装到arr数组中，数组长度是：" + arr.length);
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("本次传递的多个参数数组和是：" + sum);
    }
}
