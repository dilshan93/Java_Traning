package com.dilshan.thread;

/**
 * @author dilshanboteju
 */
public class Printer2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(" Child = "+Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
