//********************************************************************
//  Banking.java       Author: Lewis/Loftus
//
//  Driver to exercise the use of multiple Account objects.
//********************************************************************

public class Banking
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account ("Jane Smith", 69713, 40.00);
      Account acct3 = new Account ("Edward Demsey", 93757, 759.32);
      Account acct4 = new Account ("Marc Schulz", 71583);
      acct1.deposit (25.85);

      double smithBalance = acct2.deposit (500.00);
      System.out.println ("Smith balance after deposit: " +
                          smithBalance);

      System.out.println ("Smith balance after withdrawal: " + 
                          acct2.withdraw (430.75, 1.50));

      acct3.withdraw (800.00, 0.0);  // exceeds balance

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();
      acct4.addInterest();
      
      //Transfer 50 dollars from account 1 to account 2
      acct1.TransferFunds(50.00);
      double TransferFunds = acct1.getTransferFunds();
      acct2.deposit(acct1.getTransferFunds());
      
      System.out.println("You Transfered " + TransferFunds + ".");
      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
      System.out.println (acct4);
   }
}
