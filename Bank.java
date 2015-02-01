

public class Bank
{
    // instance variables - replace the example below with your own
    private String bankName;
    private String cardNumber;
    private Date date;
    

    /**
     * Constructor for objects of class Bank
     */
    public Bank()
    {
        // initialise instance variables

    }
    
    public Bank(String bankName, String cardNumber)
    {
        // initialise instance variables
        this.bankName = bankName;
        this.cardNumber = cardNumber;
    }
    
     public Bank(String bankName, String cardNumber, Date date)
    {
        // initialise instance variables
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.date = date;
    }
    
    
         
    public void setbankName(String bankName)
    {
        // put your code here
       this.bankName = bankName;
    }
    
    public String getbankName()
    {
        return bankName;
    
    }
    
    
    public void setcardNumber(String cardNumber)
    {
        // put your code here
       this.cardNumber = cardNumber;
    }
    
    public String getcardNumber()
    {
        return cardNumber;
    
    }
    
   
     public String toString(){
    
       return  getbankName() + " " + getcardNumber()+ " "+ date.toString();
    }
}
