package org.step.dz6.example3;

public class Storage {
    private int counter = 0;

    public synchronized void get()
    {
        while (counter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        counter--;
        System.out.println("-1 : товар удален");
        System.out.println(
                "\tколичество товара на складе : " + counter);
        notify();
    }
    public synchronized void put() {
        while (counter >= 5) {
            try {
                wait();
            }catch (InterruptedException e) {}
        }
        counter++;
        System.out.println("+1 : товар добавлен");
        System.out.println(
                "\tколичество товара на складе : " + counter);
        notify();
    }
}
