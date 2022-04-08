package com.itheima.Runnable;

/**
 * @author Snoopy
 * @date 2022-04-07  15:44
 */
public class SellTicketTest {
    public static void main(String[] args) {
        TicketTask task = new TicketTask();
        Thread tOne = new Thread(task, "窗口一");
        Thread tTwo = new Thread(task, "窗口二");
        Thread tThree = new Thread(task, "窗口三");

        tOne.start();
        tTwo.start();
        tThree.start();
    }
}
