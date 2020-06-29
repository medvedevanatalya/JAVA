package org.step.dz6.example3;


public class Runner {

    public static void main(String[] args) {
        System.out.println("3 вариант потока через интерфейс");
        Storage storage    = new Storage();
        Seller seller = new Seller(storage);
        Customer customer = new Customer(storage);
        new Thread(seller).start();
        new Thread(customer).start();
    }
}
