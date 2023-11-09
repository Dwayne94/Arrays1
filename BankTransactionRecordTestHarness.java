/*
 Name: Dwayne Dsouza
 Student ID: 200568219; 
 Class: In this class we are printing 500 Bank Records with unique details. Once all the details are displayed then, if User enters
 "No" then the Program ends but if, User enters "Yes" then all the records and their values are defaulted to Zero and new set of 
 unique records are printed again. User enters "No" then the program is completed. 
 */

package week8;

import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness 
{//Create the Main Method
    public static void main(String args[])
    {
        //Create a 1-D Array which will store 500 records
        BankTransactionRecord bankRecords[] = new BankTransactionRecord[500];
        
        //Create a random object for random data generation
        Random randomBankRecords = new Random();

        //Create A Scanner for the User to enter an Input
        Scanner scanner = new Scanner(System.in);

        //Using the For loop to generate 500 Random Bank Transaction Records
        for (int r=0; r<bankRecords.length; r++)
        {
            boolean canadianFunds = randomBankRecords.nextBoolean();
            //Generate a Random Decimal Number and multiply it with "62"
            double exchangeRate = randomBankRecords.nextDouble()*62;
            //Generate a Random Transaction Number between 0 to 5000
            int transactionNumber = randomBankRecords.nextInt(5000);
            //Generate a Random Transaction Reference Number between 0 to 10000
            long transactionReferenceNumber = randomBankRecords.nextLong(10000);
            //Create a new instance of the Bank Record in the Array having a unique Canadian Fund, Exchange Rate, Transaction Number and Transaction Reference Number
            bankRecords[r] = new BankTransactionRecord(canadianFunds, exchangeRate, transactionNumber, transactionReferenceNumber);
        }
        //Using the For loop, print each of the 500 records with the unique details 
        for(int i=0; i<bankRecords.length; i++)
        {
            System.out.println("Bank Record " + (i+1) + ":");
            System.out.println("Canadian Funds: " + bankRecords[i].getcanadianFunds());
            System.out.println("Exchange Rate: " + bankRecords[i].getexchangeRate());
            System.out.println("Transaction Number: " + bankRecords[i].gettransactionNumber());
            System.out.println("Transaction Reference Number: " + bankRecords[i].gettransactionReferenceNumber());
            System.out.println();
            System.out.println("----------------------------------------------------");
        }
        //Print the statement for the User to enter Yes or No
        System.out.println("Do you want to complete Phase II? Reply with Yes/No ");
        //Capture the reply Yes/No entered by the User
        String userInput = scanner.nextLine();

        //If User enters the input "Yes"
        if(userInput.equals("Yes"))
        {
            //Using the For loop to set all the records to their default value
            for(int s=0; s<bankRecords.length; s++)
            {
                bankRecords[s].setcanadianFunds(false);
                bankRecords[s].setexchangeRate(1.0);
                bankRecords[s].settransactionNumber(0);
                bankRecords[s].settransactionReferenceNumber(0);
            }

            //Print the 500 records again after all the values are defaulted 
            for (int t=0; t<bankRecords.length; t++)
            {
            System.out.println("Bank Record " + (t+1) + ":") ;
            System.out.println("Canadian Funds: " + bankRecords[t].getcanadianFunds());
            System.out.println("Exchange Rate: " + bankRecords[t].getexchangeRate());
            System.out.println("Transaction Number: " + bankRecords[t].gettransactionNumber());
            System.out.println("Transaction Reference Number: " + bankRecords[t].gettransactionReferenceNumber());
            System.out.println();
            System.out.println("----------------------------------------------------");
            }
        }
        //If User enters the Input "No"
        else
        {
            System.out.println("Program is Completed");
        }
        //Close the Scanner
        scanner.close();
    }
}
