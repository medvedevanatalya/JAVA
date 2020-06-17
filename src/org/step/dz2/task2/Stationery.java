package org.step.dz2.task2;

import java.util.Objects;


public class Stationery {
    private String name;
    private double cost;
    private int quantity;

    public Stationery(String name, double cost) {
        Objects.requireNonNull(name, "Наименование товара не может быть пустым");
        if (Double.compare(cost, 0.0) < 0) {
            throw new IllegalArgumentException("Стоимость не может быть отрицательной. Указанное значение: " + cost);
        }

        this.name = name;
        this.cost = cost;
        this.quantity = 1;
    }

    public Stationery(String name, double cost, int quantity) {
        Objects.requireNonNull(name, "Наименование товара не может быть пустым");
        if (Double.compare(cost, 0.0) < 0) {
            throw new IllegalArgumentException("Стоимость не может быть отрицательной. Указанное значение: " + cost);
        }
        else if (quantity < 0){
            throw new IllegalArgumentException("Количество не может быть отрицательным. Указанное значение: " + quantity);
        }

        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || !this.getClass().isAssignableFrom(obj.getClass())){
            return false;
        }

        Stationery other = (Stationery) obj;

        boolean isObjectNameEquals = (this.name == null && other.name == null) ||
                (this.name != null && this.name.equals(other.name));
        boolean isObjectCostEquals = this.cost == other.cost;
        boolean isObjectQuantityEquals = this.quantity == other.quantity;

        return isObjectNameEquals && isObjectCostEquals && isObjectQuantityEquals;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int randomNumber = 31;
        long temp;

        temp = Double.doubleToLongBits(cost);
        result = randomNumber * result + (int) (temp ^ (temp >>> (randomNumber + 1)));

        if (name != null) {
            result = randomNumber * result + name.hashCode();
        }

        result = randomNumber * result + quantity;

        return result;
    }

    @Override
    public String toString() {
        return "\n\t\tНаименование: " + name +
                "\n\t\tСтоимость (1 шт.): " + cost +
                "\n\t\tКоличество: " + quantity;
    }
}
