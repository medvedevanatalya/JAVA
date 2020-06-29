package org.step.dz6.example1;


public class Runner {

    public static void main(String[] args) {
        System.out.println("1 вариант потока через класс");
        EmployeeThread employees1 = new EmployeeThread("Иванов И.О.","Сергеев П.В.","Николаев А.П.","Васильев В.В.");
        EmployeeThread employees2 = new EmployeeThread("Иванова М.А.","Сергеева А.А.","Жукова Н.И.","Николаева Н.Н.");

        System.out.println("Началась обработка документов сотрудников:");
        employees1.start();
        employees2.start();
    }
}
