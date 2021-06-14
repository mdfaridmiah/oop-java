package com.playwithjava;

public class Main {

    public static void main(String[] args) {
//        Dependency Injectoin
        var cal = new TaxCalculator2020(100_0000);
        var report = new TaxReport();
        report.show(cal);
        report.show(new TaxCalculator2021());
    }
}
