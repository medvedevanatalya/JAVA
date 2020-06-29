package org.step.dz6.example2;

public class ExampleRunnable implements Runnable {
    Thread thread;

    ExampleRunnable() {
        thread = new Thread(this, "Дополнительный поток");
        System.out.println("Создан дополнительный поток " +
                thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(
                        "\tдополнительный поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(
                    "\tдополнительный поток прерван");
        }
        System.out.println(
                "\tдополнительный поток завершён");
    }
}
