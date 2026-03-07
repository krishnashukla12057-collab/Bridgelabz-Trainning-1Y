package com.gla.abstraction;

abstract class Fruit {
    abstract void test();

    public void colour() {
        System.out.println("yellow");
    }
}
class Mango extends Fruit {
    @Override
    void test() {
        System.out.println("sweet");
    }
}

class AbstractionPractice {
    public static void main(String[] args) {

        Mango m1 = new Mango();
        m1.test();
        m1.colour();
    }
}