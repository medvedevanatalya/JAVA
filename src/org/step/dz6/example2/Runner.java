package org.step.dz6.example2;


public class Runner {

    public static void main(String[] args) {
        System.out.println("2 вариант потока через интерфейс");
        new ExampleRunnable();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершён");
    }
}
