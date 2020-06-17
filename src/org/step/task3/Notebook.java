package org.step.task3;


public class Notebook extends Stationery{
    private int pageCount;

    public Notebook(double cost){
        this.name = "notebook";
        this.cost = cost;
        this.quantity = 1;
        this.pageCount = 24;
    }

    public Notebook(double cost, int pageCount){
        this.name = "notebook";
        this.cost = cost;
        this.quantity = 1;
        this.pageCount = pageCount;
    }

    public Notebook(double cost, int quantity, int pageCount){
        this.name = "notebook";
        this.cost = cost;
        this.quantity = quantity;
        this.pageCount = pageCount;
    }

    public int getPageCount(){
        return pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
}
