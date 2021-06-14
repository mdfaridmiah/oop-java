package com.playwithjava;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 40);
        int wage = employee.calculateWage(35);
        System.out.println(wage);
    }
}
