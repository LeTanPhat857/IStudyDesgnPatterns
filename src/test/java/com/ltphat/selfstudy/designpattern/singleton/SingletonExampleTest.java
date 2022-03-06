package com.ltphat.selfstudy.designpattern.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonExampleTest {

    @Test
    public void constructor_assertEqualsTwoInstance_shouldReturnTrue() {
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();
        Assertions.assertEquals(singleton1, singleton2);
    }
}