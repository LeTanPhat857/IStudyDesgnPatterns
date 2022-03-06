package com.ltphat.selfstudy.designpattern.singleton;

public class SingletonExample {
    private static SingletonExample INSTANCE = new SingletonExample();

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        return INSTANCE;
    }
}
