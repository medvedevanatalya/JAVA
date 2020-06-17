package org.step.dz2.task3;


public class Runner {
    public static void main(String[] args) {
        NoviceStationerySet noviceStationerySet = new NoviceStationerySet();

        Stationery pen = new Pen(150, 3);
        Stationery pencil = new Pencil(100);
        Stationery ruler = new Ruler(200);
        Stationery notebook = new Notebook(170);

        noviceStationerySet.addStationery(pen);
        noviceStationerySet.addStationery(pencil);
        noviceStationerySet.addStationery(ruler);
        noviceStationerySet.addStationery(notebook);

        System.out.println("До сортировки:");
        System.out.println(noviceStationerySet.toString());


        /*
        Задание 4
         */
        System.out.println("\nСортировка по наименованию:");
        noviceStationerySet.sortName();
        System.out.println(noviceStationerySet.toString());

        System.out.println("\nСортировка по стоимости:");
        noviceStationerySet.sortCost();
        System.out.println(noviceStationerySet.toString());

        System.out.println("\nСортировка по наименованию и стоимости:");
        noviceStationerySet.sortNameAndCost();
        System.out.println(noviceStationerySet.toString());
    }
}
