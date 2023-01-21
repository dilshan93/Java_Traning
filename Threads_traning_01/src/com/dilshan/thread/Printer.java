package com.dilshan.thread;

/**
 * @author dilshanboteju
 */
public class Printer extends Thread{

    @Override
    public void start() {
        System.out.println(" start child thread!!");
        super.start();
    }

    @Override
    public void run() {
        //System.out.println("This is from chid thread! ");
        for (int i = 0; i < 100; i++) {
            System.out.println(" Child = "+currentThread().getName()+" "+i);
        }
    }


}
