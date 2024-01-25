package com.test.app;

public class HomeLoanService extends LoanService implements CreditInterface{
    @Override
    public void applyLoan(Customer customer) {

        if(customer.getLoan().getLoanTypes()!=null)
        {
        if(customer.getLoan().getLoanTypes().equals(LoanTypes.HOME.name())){
            String creditCheckPassed = performCreditCheck(customer);
            if(creditCheckPassed.equals("Yes")) {
                Loan loan = new Loan();
                int finalLoanAmount = customer.getLoan().getLoanAmount() * 80 / 100;
                int maxLoanAmount = calculateLoanCap(LoanTypes.HOME);
                if (finalLoanAmount > maxLoanAmount) {
                    System.out.println(" The max loan cap reached for home loan. Loan can't be disbursed");
                } else {
                    loan.setLoanAmount(finalLoanAmount);
                    loan.setInterest(finalLoanAmount / 10);
                    customer.setLoan(loan);
                    System.out.println(" Home loan disbursed. Final loan amount = " + finalLoanAmount);
                }
            }
            else
            {
                System.out.println(" Your credit rating is not good enough for getting a loan.");
            }
        }
        else
        {
            System.out.println("You should visit a different loan department");
        }
        }


    }

    @Override
    int calculateLoanCap(LoanTypes loanTypes) {

        int maxLoanAmount = 0;
        if(loanTypes.equals(LoanTypes.HOME))
        {
            maxLoanAmount = 10000;
        }
        return  maxLoanAmount;
    }

    @Override
    public String performCreditCheck(Customer customer) {
        String creditCheckPassed = null;

        if(customer.getCreditRating()<=700 || customer.getAge()<=21)
        {
            creditCheckPassed = "No";
        }
        else if(customer.getCreditRating()>=700 || customer.getAge()>=21)
        {
            creditCheckPassed = "Yes";
        }

        System.out.println("Credit check passed? "+creditCheckPassed);

      return creditCheckPassed;
    }
}
