package org.step.dz6.example1;

public class EmployeeThread extends Thread{
    private String[] fio;

    public EmployeeThread(String... fio) {
        this.fio = fio;
    }

    @Override
    public void run() {
        for (int i = 0; i < fio.length; i++) {
            System.out.println("Обработаны документы: " + fio[i]);
            try {
                sleep(500);
            } catch (Exception e) {}
        }
    }
}
