package com.test.app;

abstract class LoanService {

    private LoanTypes loanTypes;
    abstract void applyLoan(Customer customer);
    abstract int calculateLoanCap(LoanTypes loanTypes);
    void verifyApplicant()
    {
    System.out.println("Applicant verification for loan started.");
    }
}
