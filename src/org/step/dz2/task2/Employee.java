package org.step.dz2.task2;

import java.util.*;


public class Employee {
    private static int lastID = 0;

    private String name;
    private String surname;
    private int id;
    private Set<Stationery> stationery = new HashSet<>();

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++lastID;
    }

    public Employee(String name, String surname, List<Stationery> stationery) {
        this.name = name;
        this.surname = surname;
        this.stationery.addAll(stationery);
        this.id = ++lastID;
    }

    public void addStationery(Stationery obj) {
        Objects.requireNonNull(obj, "Аргумент объекта канцтовары не может быть пустым");

        stationery.add(obj);
    }

    public void removeStationery(Stationery obj) {
        Objects.requireNonNull(obj, "Аргумент объекта канцтовары не может быть пустым");

        stationery.remove(obj);
    }

    public double getStationeryTotalCost() {
        double totalCost = 0.0;

        if (stationery.isEmpty()) {
            return totalCost;
        }

        for (Stationery item : stationery) {
            totalCost += (item.getCost() * item.getQuantity());
        }

        return totalCost;
    }

    public int getID() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || !this.getClass().isAssignableFrom(obj.getClass())){
            return false;
        }

        Employee employee = (Employee) obj;

        return (id == employee.id);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник:" +
                "\n\tID: " + id +
                "\n\tИмя: " + name +
                "\n\tФамилия: " + surname +
                "\n\tКанцтовары: " + stationery +
                "\n\tПолная стоимость: " + getStationeryTotalCost();
    }
}
