package com.itheima.Runnable;

/**
 * @author Snoopy
 * @date 2022-04-07  15:42
 */
public class TicketTask implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + "窗口卖出了第" + ticket +"张票！！");
                ticket--;
            }
        }
    }
}
