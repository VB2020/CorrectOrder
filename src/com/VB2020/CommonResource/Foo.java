package com.VB2020.CommonResource;

// Данный класс Foo - это общий ресурс!

import java.util.concurrent.Semaphore;

public class Foo
{
    // разрешим доступ потоку А
    Semaphore semaphore_A = new Semaphore(1);

    // запретим доступ потоку B
    Semaphore semaphore_B = new Semaphore(0);

    // запретим доступ потоку С
    Semaphore semaphore_C = new Semaphore(0);

    public void first() throws InterruptedException {
        semaphore_A.acquire(); // спросим разрешения
        print("first");
        semaphore_B.release(); // освободим доступ
    }

    public void second() throws InterruptedException {
        semaphore_B.acquire();
        print("second");
        semaphore_C.release();
    }

    public void third() throws InterruptedException {
        semaphore_C.acquire();
        print("third");
        semaphore_A.release();
    }

    public static void print(String name)
    {
        System.out.print(" -> " + name);
    }
}
