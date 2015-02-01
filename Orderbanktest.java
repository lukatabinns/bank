import java.util.Collections;
import java.util.Comparator;

public class Orderbanktest
{
    public static void main(String [] args)
    {
        //create bank object
        Orderbank banks = new Orderbank( "bankName", "cardNumber", new Date());
        Bank b1 = banks;
        Date d1 = new Date("Nov",2017);
        Date d2 = new Date ("Oct",2017);
        Date d3 = new Date ("Dec",2018);
        banks.addBank(new Bank("HSBC Canada","5601-2345-3446-5678",d1));
        banks.addBank(new Bank("Royal Bank of Canada","4519-4532-4524-2456",d2));
        banks.addBank(new Bank("American Express","3786-7334-8965-345",d3));
        System.out.println(banks.toString());
        
        Collections.sort(banks, new Comparator<Bank>()
        {

            @Override
            public int compare(Bank t, Bank t1) {
                return t.d1 - t1.d3;
            }
        });


       
    }
}
