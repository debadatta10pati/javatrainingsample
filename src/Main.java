import com.test.app.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //One dimensional
/*
        String[] branchNames = new String[3];
        branchNames[0] = "Manila";
        branchNames[1] = "Mumbai";
        branchNames[2] = "Paris";

        // Multi dimensional : an array of arrays that represents multiple rows and columns.
        int marks[][] = {
                {77,85,68,99,87},
                {98,56,79,90,92},
                {78,88,56,70,99}
        };

        int result[][] = new int[3][5];

       System.out.println("marks[1][0] = "+marks[1][0]);
       //System.out.println(" Bank branch name at index 1 = "+branchNames[1]);
       //System.out.println(" Number of branches  = "+branchNames.length);*/


// both will create a 2D array with 3 rows and 5 columns.

        /*Customer customer = new Customer();
        customer.setName("Deba");
        customer.setAge(31);
        customer.setCreditRating(800);
        customer.setBankAccountType("Saving");
        Loan loan = new Loan();
        loan.setLoanAmount(20000);
        loan.setLoanTypes(LoanTypes.HOME);
        customer.setLoan(loan);

        HomeLoanService homeLoanService = new HomeLoanService();
        homeLoanService.applyLoan(customer);*/

       // String customers[] = {"Deba","Sam","Yasmin"};

       /* for (String customer : customers) {
            System.out.println(" Customer applied for loan " + customer);
        }
*/
/*        int i = 0;
        while( i <customers.length)
        {
            System.out.println(" Customer applied for loan " + customers[i]);
            i++;
        }*/

        // String operations

        /*String str = "014-22-8909";
        String[] arrOfStr = str.split("-",3);
        System.out.println("The last 4 digits are = "+arrOfStr[2]);

        for (String a : arrOfStr)
        {System.out.println(a);
        }

        String s1 = "Hello World";
        String s2 = "Goodbye World";

        String s3 = s1.concat(s2);
        String s4 = s1+s2;

        String s5 = s1.substring(6);
        String s6 = s2.substring(8);

        System.out.println("Is s5 equal to s6? "+s5.equals(s6));

        if(s1.contains("Hele"))
        {
            System.out.println("Contains the char sequence ");
        }



        //System.out.println("Concatenated string = "+s3);
        //System.out.println("Another Concatenated string = "+s4);
        System.out.println("Sub string = "+s5);*/

    /*  String dob ="2010-12-12";

        LocalDate dobConverted = LocalDate.parse(dob);
        LocalDate today = LocalDate.now();

        if(dobConverted.plusYears(18).isAfter(today))
        {
            System.out.println("You are not 18 yet. ");
        }
        else
        {
            System.out.println("You are registered successfully.");
        }

       // LocalDateTime dobConvertedTime = LocalDateTime.parse(dob);

        System.out.println("DOB coverted = "+dobConverted);

        //System.out.println("DOB coverted with time = "+dobConvertedTime);


        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

        String weddingDate = "10-Apr-2019";

        Date date = null;
        try {
            date = sdf.parse(weddingDate);
        } catch (ParseException e) {
            System.out.println("Logging exception "+e);
        }

        System.out.println("Wedding date parsed= "+date);

        ExceptionExamples exceptionExamples = new ExceptionExamples();
        exceptionExamples.checkNumberFormatException();*/

        LoanUtilService loanUtilService = new LoanUtilService();
        loanUtilService.calculateInterestRates("STUDY");
    }
}