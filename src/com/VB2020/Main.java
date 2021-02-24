package com.VB2020;

import com.VB2020.CommonResource.Foo;
import com.VB2020.Threads.A;
import com.VB2020.Threads.B;
import com.VB2020.Threads.C;

public class Main {

    public static void main(String[] args) {
        Foo foo = new Foo();
        // порядок можно менять
        // а результат все равно будет:
        // -> first -> second -> third
        new C (foo);
        new B (foo);
        new A (foo);
    }
}
