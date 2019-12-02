package com.company.Duck;

import com.company.Duck.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quak");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
