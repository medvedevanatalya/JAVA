package org.step.dz2.task1;

import java.util.Objects;


public class Pen {
    private double cost;
    private String color;

    public Pen() {
        this.cost = 100;
        this.color = "blue";
    }

    public Pen(double cost) {
        this.cost = cost;
        this.color = "blue";
    }

    public Pen(double cost, String color) {
        Objects.requireNonNull(color, "Цвет не может быть нулевым");
        if (cost <= 0.0) {
            throw new IllegalArgumentException("Стоимость не может быть отрицательной. Указанное значение: " + cost);
        }

        this.cost = cost;
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !this.getClass().isAssignableFrom(obj.getClass())){
            return false;
        }

        Pen other = (Pen) obj;

        boolean isObjectCostEquals = this.cost == other.cost;
        boolean isObjectColorEquals = (this.color == null && other.color == null) ||
                (this.color != null && this.color.equals(other.color));

        return isObjectCostEquals && isObjectColorEquals;
    }

    @Override
    public int hashCode() {
        int result;
        int randomNumber = 31;

        result = color.hashCode();
        result = randomNumber * result + Double.hashCode(cost);

        return result;
    }

    @Override
    public String toString() {
        return "Ручка: " + "цвет = " + color + ", стоимость = " + cost + ';';
    }
}
