package com.test.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class CustomerService {

    //Used when customer's kyc is not done but credit rating is available
    public void addPrevilieges(int creditRating)
    {
        if(creditRating>=700)
        {
            System.out.println(" Customer previliges are : locker and 1% cashback in all transacations");
        }
    }

    //Used when customer's kyc is  done and credit rating is available
    public void addPrevilieges(int creditRating, boolean isKycDone)
    {
        if(creditRating>700 && isKycDone)
        {
            System.out.println(" Customer previliges are : locker and 1% cashback in all transacations and personal banker");
        }
        else if (creditRating>=500 && creditRating<=700 && isKycDone)
        {
            System.out.println(" Customer previliges are : locker and 1% cashback");
        }
        else
        {
            System.out.println(" Customer previliges are : locker");
        }
    }
    
    public int calculateFlatCashback(CustomerType customerType)
    {
        int flatCashback = switch(customerType)
        {
            case GOLD, DIAMOND -> 1000;
            default -> 500;
        };

        HashMap<String, Integer> map = new HashMap<>();

        return flatCashback;
    }

    public ArrayList<Customer> createCustomerList()
    {
        ArrayList<Customer> customers = new ArrayList<>();
        //First customer
        Customer customer1 = new Customer();
        customer1.setAge(32);
        customer1.setName("Don");
        customer1.setCustomerId("BANK1000");
        customer1.setBankAccountType("Saving");
        customer1.setCreditRating(400);
        customer1.setInitialAccountBalance(9000);
        customer1.setAddress(" 1 Manila Road, Manila");
        customer1.setCustomerType(CustomerType.PLATINUM);

        // Second customer
        Customer customer2 = new Customer();
        customer2.setAge(37);
        customer2.setName("Sara");
        customer2.setCustomerId("BANK1001");
        customer2.setBankAccountType("Saving");
        customer2.setCreditRating(400);
        customer2.setInitialAccountBalance(1000);
        customer2.setAddress(" 2 Mumbai Street, Mumbai");
        customer2.setCustomerType(CustomerType.SILVER);

        // Second customer
        Customer customer3 = new Customer();
        customer3.setAge(22);
        customer3.setName("Mark");
        customer3.setCustomerId("BANK1002");
        customer3.setBankAccountType("Investment");
        customer3.setCreditRating(900);
        customer3.setInitialAccountBalance(18000);
        customer3.setAddress(" 3 Jefferson Road, Miami");
        customer3.setCustomerType(CustomerType.DIAMOND);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        System.out.println(" Number of customers = "+customers.size());

        return customers;

    }

    public void openbankAccount(ArrayList<Customer> customers)
    {
        HashMap<String,String> wlecomeKitMap = sendWelcomeKit(customers);

        for(Customer customer:customers) {
            if (customer.getBankAccountType() != null) {
                if (customer.getBankAccountType().equals("Saving")) {
                    if (customer.getInitialAccountBalance() >= 3000) {
                        System.out.println(" Savings bank account opened for customer. "+customer.getName());
                        addPrevilieges(customer.getCreditRating(), customer.isKycDone());
                        int flatCashback = calculateFlatCashback(customer.getCustomerType());

                        if((wlecomeKitMap.containsKey(customer.getCustomerId())) && (customer.getInitialAccountBalance() > 8000))
                        {
                            System.out.println(" Welcome kit sent : ATM card, bank booklet, bank logo stickers to address : "+ wlecomeKitMap.get(customer.getCustomerId()));
                        }
                    } else {
                        System.out.println(" 3000 is the minimum required balance for saving bank account.");
                    }

                } else if (customer.getBankAccountType().equals("Investment")) {
                    if ((customer.getInitialAccountBalance() >= 10000)
                            && (customer.getCreditRating() >= 500)
                            && (customer.getAge() >= 21)) {
                        System.out.println(" Investment bank account opened for customer."+customer.getName());
                        addPrevilieges(customer.getCreditRating(), customer.isKycDone());
                        int flatCashback = calculateFlatCashback(customer.getCustomerType());
                    } else {
                        System.out.println(" 10000 is the minimum required balance for investment bank account.");
                    }

                }
            }
        }
    }

    public HashMap<String,String> sendWelcomeKit(ArrayList<Customer> customers)
    {
        HashMap<String,String> wlecomeKitMap = new HashMap<>();

        for(Customer customer: customers)
        {
            wlecomeKitMap.put(customer.getCustomerId(),customer.getAddress());
        }



    return wlecomeKitMap;
    }

    public void stringToDate() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String dateInString = "7-Jun-2023";

        Date date =  formatter.parse(dateInString);
    }
}
