package com.dilshan.thread;

/**
 * @author dilshanboteju
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {
//        Printer printer = new Printer();
//        printer.setDaemon(true);
//        printer.start();
        Printer2 printer2 = new Printer2();
        Thread thread = new Thread(printer2);
        thread.start();
        thread.join(5000);


        //System.out.println("This is Main Thrad!");
        for (int i = 0; i < 50; i++) {
            System.out.println(" Main = "+Thread.currentThread().getName()+" "+i);
        }
        System.out.println("==================================");
    }
}
