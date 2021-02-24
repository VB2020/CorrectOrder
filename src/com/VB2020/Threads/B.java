package com.VB2020.Threads;

import com.VB2020.CommonResource.Foo;

public class B implements Runnable{
    private final Foo foo;

    public B(Foo object)
    {
        this.foo = object;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            foo.second();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
