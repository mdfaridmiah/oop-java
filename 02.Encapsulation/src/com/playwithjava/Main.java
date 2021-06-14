package com.playwithjava;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee();
        employee.setBaseSalary(60000);
        employee.setHourlyRate(40);
        int wage = employee.calculateWage(30);
        System.out.println(wage);

    }
}
