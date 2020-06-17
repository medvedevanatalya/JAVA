package org.step.task3;


public class Pencil extends Stationery {
    private String type;

    public Pencil(double cost){
        this.name = "pencil";
        this.cost = cost;
        this.quantity = 1;
        this.type = "simple";
    }

    public Pencil(double cost, String type){
        this.name = "pencil";
        this.cost = cost;
        this.quantity = 1;
        this.type = type;
    }

    public Pencil(double cost, int quantity, String type){
        this.name = "pencil";
        this.cost = cost;
        this.quantity = quantity;
        this.type = type;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}
