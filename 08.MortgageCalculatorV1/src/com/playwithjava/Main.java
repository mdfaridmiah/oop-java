package com.playwithjava;

/***
 * ---  Mortgage Calculator---
 *
 */

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}

/**
 5000
 5
 1

 MORTGAGE
 --------
 Monthly Payments: $428.03

 PAYMENT SCHEDULE
 ----------------
 $4,592.80
 $4,183.90
 $3,773.29
 $3,360.98
 $2,946.94
 $2,531.18
 $2,113.69
 $1,694.46
 $1,273.49
 $850.75
 $426.26
 $0.00
 */
