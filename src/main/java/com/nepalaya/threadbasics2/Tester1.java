package com.nepalaya.threadbasics2;

public class Tester1 {

    public static void main(String[] args) {
        System.out.println("START-This is printed by the main thread: "+ Thread.currentThread().getName());

        Runnable runnable = () ->{
            int i =1;
            while(i<10){
                System.out.println("This is printed by: "+ Thread.currentThread().getName()+" , i:"+ i++);
            }

        };
        Thread thread1Runner = new Thread(runnable,"thread1");
        Thread thread2Runner = new Thread(runnable,"thread2");

        thread1Runner.start();
        thread2Runner.start();
        try{
            //join() Here main thread waits for the thread1 task to finish to do the remaining task of main thread!
            thread1Runner.join();
            thread2Runner.join();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("END-This is printed by the main thread: "+ Thread.currentThread().getName());

    }
}
