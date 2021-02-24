package com.VB2020.Threads;

import com.VB2020.CommonResource.Foo;

public class C implements Runnable {
    private final Foo foo;

    public C(Foo object)
    {
        this.foo = object;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            foo.third();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
