package com.test.app;

public class LoanUtilService {

    public void calculateInterestRates(String loanType)
    {
        int intrestRate =0;

        switch(loanType)
        {
            case "HOME" : intrestRate = 10;
            break;
            case "PERSONAL" : intrestRate = 12;
            break;
            case "CAR" : intrestRate = 10;
            break;
            case "EDUCATION" : intrestRate = 7;
            break;
            default : throw new RuntimeException(loanType+ " is not a valid loan type");
        }
    }

}
