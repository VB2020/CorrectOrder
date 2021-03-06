package com.VB2020.Threads;

import com.VB2020.CommonResource.Foo;

public class A implements Runnable {
    private final Foo foo;

    public A(Foo object)
    {
        this.foo = object;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            foo.first();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
