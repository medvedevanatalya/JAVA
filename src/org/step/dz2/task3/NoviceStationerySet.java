package org.step.dz2.task3;

import org.step.dz2.task4.StationeryCostSort;
import org.step.dz2.task4.StationeryNameAndCostSort;
import org.step.dz2.task4.StationeryNameSort;

import java.util.ArrayList;
import java.util.List;

public class NoviceStationerySet {

    private final List<Stationery> list = new ArrayList<>();

    public void addStationery(Stationery item){
        list.add(item);
    }

    public double getTotalCost(){
        return list.stream().mapToDouble( (s) -> s.getCost() * s.getQuantity()).sum();
    }

    @Override
    public String toString() {
        return "Набор новичка: " + list +
                "\n\tПолная стоимость: " + getTotalCost();
    }

    /*
    Задание 4
     */
    public void sortName() {
        list.sort(new StationeryNameSort());
    }
    public void sortCost() {
        list.sort(new StationeryCostSort());
    }
    public void sortNameAndCost() {
        list.sort(new StationeryNameAndCostSort());
    }
}
