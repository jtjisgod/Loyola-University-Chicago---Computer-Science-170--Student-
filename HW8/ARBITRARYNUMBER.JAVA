
/**
 * Takes in as many values as the user defines and tells how often the user types it in
 * 
 * @author Marc Schulz 
 * @version March 25, 2003
 */

public class ArbitraryNumber
{
    public static void main(String[] args)
    {
        String userResponse = "yes";
        int x;
        int[] freq = new int [51];
        
        while (userResponse.equalsIgnoreCase("yes"))
        {
            System.out.print("Enter a Number: ");
            x = Keyboard.readInt();
            if (x <=50 && x>0)
            {
                freq[x]++;
                System.out.print("Would you like to continue? ");
                userResponse = Keyboard.readString();
            }
            else
                System.out.println("Error");
        }
        for(int i=0; i<freq.length; i++)
        {
         if (freq[i] > 0)  
         System.out.println( i + " " + freq[i]);
        }
    }
}