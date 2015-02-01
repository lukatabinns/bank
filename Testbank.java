

public class Testbank
{
     public static void main(String [] args)
    {
        //create bank object
        Bank bank  = new Bank();
        Bank bank1  = new Bank();
        Bank bank2  = new Bank();

        
        bank.setbankName("HSBC Canada");
        
        bank.setcardNumber("5601-2345-3446-5678");
        
        bank1.setbankName("Royal Bank of Canada");
        
        bank1.setcardNumber("4519-4532-4524-2456");
        
        bank2.setbankName("American Express");
        
        bank2.setcardNumber("3786-7334-8965-345");
        
        System.out.println(bank.toString());
        System.out.println(bank1.toString());
        System.out.println(bank2.toString());
  
    }
    
}
