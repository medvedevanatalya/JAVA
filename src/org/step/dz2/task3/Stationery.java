package org.step.dz2.task3;


public abstract class Stationery {
    protected String name;
    protected double cost;
    protected int quantity;

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
    public String toString() {
        return "\n\tНаименование: " + name +
                "\n\tСтоимость (1 шт.): " + cost +
                "\n\tКоличество: " + quantity;
    }
}
