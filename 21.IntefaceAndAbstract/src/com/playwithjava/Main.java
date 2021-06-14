package com.playwithjava;

public class Main {

    public static void main(String[] args) {
        var cal = new TaxCalculator2020(7000000, 30000);
        var report = new TaxReport();
        report.show(cal);
        report.show(new TaxCalculator2021());
    }
}

