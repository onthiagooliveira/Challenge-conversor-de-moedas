package br.com.one.models;

public class TargetCurrency extends Currency{
    private String currencyCodeTarget;


    public TargetCurrency(String targetCurrency) {
        this.currencyCodeTarget = targetCurrency;
    }

    public String getCurrencyCodeTarget() {
        return currencyCodeTarget;
    }

    public void setCurrencyCodeTarget(String currencyCodeTarget) {
        this.currencyCodeTarget = currencyCodeTarget;
    }
}
