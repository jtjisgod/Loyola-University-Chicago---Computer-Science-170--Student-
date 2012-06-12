
/**
 * Write a description of class CSCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import cs1.Keyboard;
import java.text.NumberFormat;
public class CSCard
{
    
    public static void main(String[] args)
    {   double initBalance;
        double newBalance;
        double basicCharges;
        double minPayment = 0;
        double nextBalance;
        double interest;
        System.out.print("What is your previous Balance?: ");
        initBalance = Keyboard.readDouble();
        System.out.print("What are your additional Charges?: ");
        basicCharges = Keyboard.readDouble();
        nextBalance = (initBalance + basicCharges);
        interest = (nextBalance*0.02);
        newBalance = nextBalance + interest;
        if (newBalance < 50)
           { 
            minPayment = -newBalance;
           }
         else if ( newBalance < 300 )
            {
             minPayment = 50 ;
             }
         else if (newBalance > 300)
             {
              minPayment = (newBalance*0.20);
             }
             
     NumberFormat money = NumberFormat.getCurrencyInstance();
     
     
     System.out.println("CS CARD International Statement");
     System.out.println("===============================");
     System.out.println("");
     System.out.println("Previous Balance:      "+ money.format(initBalance));
     System.out.println("Additional Charges:    "+ money.format(basicCharges)); 
     System.out.println("Interest:              "+ money.format(interest));
     System.out.println("");
     System.out.println("New Balance:           "+ money.format(newBalance));
     System.out.println("");
     System.out.println("Minimum Payment:       "+ money.format(minPayment));
     }
}


            