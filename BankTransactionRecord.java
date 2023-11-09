/* 
Name: Dwayne Dsouza
Student ID: 200568219
Class Details: In this class, 4 Instance Variables are initialized. A Class/Static Variable is also initialized. A parameterized 
Constructor is created. Setters and Getters are used for each defined variable.
*/

package week8;

public class BankTransactionRecord 
{
    //Initialize the respective Instance Variables
    private boolean canadianFunds;
    private double exchangeRate; 
    private int transactionNumber;
    private long transactionReferenceNumber; 
    //Public Class Variable to keep track of the number of records instantiated.
    //A Class Variable is also a Static Variable. 
    public static int recordsNumber = 0;

    //Parameterized Constructor
    public BankTransactionRecord(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber)
    {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate; 
        this.transactionNumber = transactionNumber; 
        this.transactionReferenceNumber = transactionReferenceNumber;
        //Increment the record count when one record is created
        recordsNumber++;
    }

    //Use the Getter for Variable1 
    public boolean getcanadianFunds()
    {
        return canadianFunds;
    }
    //Use the Setter for Variable1
    public void setcanadianFunds(boolean cf)
    {
        this.canadianFunds = cf;
    }

    //Use the Getter for Variable2
    public double getexchangeRate()
    {
        return exchangeRate;
    }
    //Use the Setter for Variable2
    public void setexchangeRate(double er)
    {
        this.exchangeRate = er;
    }

    //Use the Getter for Variable3
    public int gettransactionNumber()
    {
        return transactionNumber;
    } 
    //Use the Setter for Variable3
    public void settransactionNumber(int tn)
    {
        this.transactionNumber = tn;
    }

    //Use the Getter for Variable4
    public long gettransactionReferenceNumber()
    {
        return transactionReferenceNumber;
    } 
    //Use the Setter for Variable4
    public void settransactionReferenceNumber(long trn)
    {
        this.transactionReferenceNumber = trn;
    } 
    
    //Use the Getter for Static/Class Variable
    public static int getrecordsNumber()
    {
        return recordsNumber;
    }
    
    /*
    Static or Class Variables represent the Class and are not associated with individual references of the class. They are shared among all 
    instances of the class and accessible through the class name. A setter is used to modify the value of an instance variable (non-static) 
    for a specific object, and static variables are not associated with any particular object. Therefore, there's no need for a setter to 
    change its value manually; it's updated automatically as objects are created.
    */
}
