package org.step.task3;


public class Ruler extends Stationery {
    private int size;

    public Ruler(double cost){
        this.name = "ruler";
        this.cost = cost;
        this.quantity = 1;
        this.size = 20;
    }

    public Ruler(double cost, int size){
        this.name = "ruler";
        this.cost = cost;
        this.quantity = 1;
        this.size = size;
    }

    public Ruler(double cost, int quantity, int size){
        this.name = "ruler";
        this.cost = cost;
        this.quantity = quantity;
        this.size = size;
    }

    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
}
