package com.playwithjava;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);

        Employee.printNumberOfEmployees();

        int wage = employee.calculateWage();
        System.out.println(wage);

        wage = employee.calculateWage(60);
        System.out.println(wage);

        Employee.printNumberOfEmployees();
    }
}
