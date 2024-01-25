package com.test.app;

public class GoldCustomer extends Customer{

    private String customerPrevilige;

    private int initialAccountBalance = super.initialAccountBalance+5000;


    public GoldCustomer() {
        super();
        System.out.println(" A Gold customer is created.");
    }

    public void getDefaultPrevileges()
    {
        System.out.println(" Gold customer previleges are : " +
                "ATM card, Free ATM withdrawal, 1% interest, 1% cashback, locker at 50% discount, personal banker");
    }

    public String getCustomerPrevilige() {
        return customerPrevilige;
    }

    public void setCustomerPrevilige(String customerPrevilige) {
        this.customerPrevilige = customerPrevilige;
    }

    public int getInitialAccountBalance() {
        return initialAccountBalance;
    }

    public void setInitialAccountBalance(int initialAccountBalance) {
        this.initialAccountBalance = initialAccountBalance;
    }
}
