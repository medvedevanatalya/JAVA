package org.step.task2;


public class Runner {
    public static void main(String[] args) {
        Stationery firstStationery = new Stationery("pen", 150, 3);
        Stationery secondStationery = new Stationery("pencil", 50);
        Stationery thirdStationery = new Stationery("pen", 110, 5);
        Stationery fourthStationery = new Stationery("pencil", 70, 2);
        Stationery fifthStationery = new Stationery("ruler", 190);

        Employee firstEmployee = new Employee("Alex", "Petrov");
        Employee secondEmployee = new Employee("Anna", "Ivanov");

        firstEmployee.addStationery(firstStationery);
        firstEmployee.addStationery(secondStationery);
        secondEmployee.addStationery(thirdStationery);
        secondEmployee.addStationery(fourthStationery);
        secondEmployee.addStationery(fifthStationery);

        System.out.println(firstEmployee.toString());
        System.out.println(secondEmployee.toString());
    }
}
