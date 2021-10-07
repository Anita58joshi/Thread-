package com.nepalaya.threadbasics2;

public class Livelock {
    public static void main(String[] args) {

        //Shared Resource
        Integer x = 0;

        Thread incrementor = new Thread(() -> {
            new LivelockInc(x).increment();
        });
        Thread decrementor = new Thread(() -> {
            new LivelockDec(x).decrement();
        });

        incrementor.start();
        decrementor.start();
    }
}


    class LivelockInc {
        Integer x;

        public LivelockInc(Integer x) {
            this.x = x;
        }

        public void increment() {
            do {
                synchronized (x) {
                    x++; //read-write operation
                    System.out.println("A toss the ball: "+ x);
                }
            } while (x<10);

        }
    }


    class LivelockDec {
        Integer x;

        public LivelockDec(Integer x) {
            this.x = x;
        }

        public void decrement() {
            do {
                synchronized (x) {
                    x--; //read-write operation
                    System.out.println("B toss the ball: "+ x);

                }
            } while (x > -10);

        }
    }


