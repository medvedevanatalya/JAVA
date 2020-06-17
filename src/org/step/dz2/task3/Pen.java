package org.step.dz2.task3;

import java.util.Objects;


public class Pen extends Stationery {
    private String color;

    public Pen(double cost) {
        this.name = "pen";
        this.cost = cost;
        this.quantity = 1;
        this.color = "blue";
    }

    public Pen(double cost, int quantity) {
        if (cost < 0.0) {
            throw new IllegalArgumentException("Стоимость не может быть отрицательной. Указанное значение: " + cost);
        }
        else if(quantity < 0) {
            throw new IllegalArgumentException("Количество не может быть отрицательным. Указанное значение: " + quantity);
        }

        this.name = "pen";
        this.cost = cost;
        this.quantity = quantity;
        this.color = "blue";
    }

    public Pen(double cost, int quantity, String color) {
        Objects.requireNonNull(color, "Цвет не может быть нулевым");
        if (cost < 0.0) {
            throw new IllegalArgumentException("Стоимость не может быть отрицательной. Указанное значение: " + cost);
        }
        else if(quantity < 0) {
            throw new IllegalArgumentException("Количество не может быть отрицательным. Указанное значение: " + quantity);
        }

        this.name = "pen";
        this.cost = cost;
        this.quantity = quantity;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
