import java.util.ArrayList;


/**
 * Write a description of class Orderbank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orderbank extends Bank
{
    // instance variables - replace the example below with your own

    private ArrayList<Bank>banks;
    private Date date;

    /**
     * Constructor for objects of class Orderbank
     */
      public Orderbank(String bankName, String cardNumber, Date date)
    {
        // initialise instance variables
        super(bankName, cardNumber);
        banks = new ArrayList<Bank>();
        this.date = date;
        
    }
    
      public void addBank(Bank b)
    {
        banks.add(b);

    }
    
      public void getDate(Date d)
    {
         date = d;

    }
        
      
    public String toString()
    {
        return banks.toString();
    }
}


