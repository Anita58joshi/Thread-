package com.nepalaya.threadbasics;

public class Main {
    public static void main(String[] args) {


        String painting = "Monalisa-";
        String painter = "Painter-";

        for (int i = 1; i <= 10; i++) {
            new Thread(new Painter(painter + i, painting + i, i)).start();
        }













//        System.out.println("Thread Day");
//        System.out.println(Thread.currentThread().getName());
//
//        Thread t1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//
//        Thread t2 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//
//
//        Thread t3 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();


        //how many thread has been created => 4

//        //anonymous class
//        Walkable walkable = new Walkable() {
//            @Override
//            public void walk() {
//                System.out.println("Walking Anonymous");
//            }
//        };
//
//        //lambda
//        Walkable walkable1 = () ->
//                System.out.println("Walking with Lambda");

    }
}

