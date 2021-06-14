package com.playwithjava;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 10);
        int wage = employee.calculateWage(45);
        System.out.println(wage);
    }
}
