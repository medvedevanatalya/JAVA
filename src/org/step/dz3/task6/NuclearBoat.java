package org.step.dz3.task6;


import org.step.dz3.task7.ClassAnnotation;

@ClassAnnotation
public class NuclearBoat {
    private boolean isRunning;
    private EngineForNuclearBoat engine;

    @ClassAnnotation
    private String someText;
    public String getSomeText() {
        String someText = this.someText;
        return this.someText;
    }

    public NuclearBoat() {
        engine = new EngineForNuclearBoat();
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void startEngine() {
        engine.run();
    }

    public void stopEngine() {
        engine.stop();
    }

    private class EngineForNuclearBoat {

        private void run() {
            if (!NuclearBoat.this.isRunning) {
                NuclearBoat.this.isRunning = true;
                System.out.println("Двигатель запущен");
            }
        }

        private void stop() {
            if (NuclearBoat.this.isRunning) {
                NuclearBoat.this.isRunning = false;
                System.out.println("Двигатель остановлен");
            }
        }
    }
}
