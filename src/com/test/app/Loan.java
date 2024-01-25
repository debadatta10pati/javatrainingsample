package com.test.app;

public class Loan {

    private int loanAmount;

    private String loanTypes;

    private int interest;

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanTypes() {
        return loanTypes;
    }

    public void setLoanTypes(String loanTypes) {
        this.loanTypes = loanTypes;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
}
