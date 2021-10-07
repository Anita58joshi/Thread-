package com.nepalaya.threadbasics1;

public class User implements Runnable{

    private Account account;
    private Transaction something;

    public User(Account account, Transaction something) {
        this.account = account;
        this.something = something;
    }

    @Override
    public void run() {
        something.process(account);
    }
}


