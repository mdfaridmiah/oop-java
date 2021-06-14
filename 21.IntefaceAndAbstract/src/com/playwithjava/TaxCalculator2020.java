package com.playwithjava;

public class TaxCalculator2020 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2020(double income, double expenses) {
        this.taxableIncome =  getTaxabaleIncome(income,expenses);
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}

