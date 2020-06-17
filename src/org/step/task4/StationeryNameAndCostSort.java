package org.step.task4;

import org.step.task3.Stationery;

import java.util.Comparator;

public class StationeryNameAndCostSort implements Comparator<Stationery> {

    @Override
    public int compare(Stationery obj1, Stationery obj2) {
        if (obj1 == obj2){
            return 0;
        }
        if (obj1 == null){
            return -1;
        }
        if (obj2 == null){
            return 1;
        }

        int result = obj1.getName().compareTo(obj2.getName());

        if (result == 0) {
            return Double.compare(obj1.getCost(), obj2.getCost());
        }

        return result;
    }
}
