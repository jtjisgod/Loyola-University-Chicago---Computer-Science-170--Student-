
/*****************************************************************************************
 *Generate lots of problems for the user to solve.  For each individual problem the user * 
 *has to keep trying until he or she gets it right.  You should generate each problem    *
 *randomly.Be sure to work out how the program should terminate, and make that clear     *
 *to the user.                                                                           *
 *                                                                                       *
 * @author Marc Schulz                                                                   *
 * @version February 10, 2003                                                            *
 *****************************************************************************************/

import cs1.Keyboard; 
import java.util.Random;
public class MathDrillB
{  public static void main(String[] args)
   {
        Random generator = new Random();  
        String userResponse = "Yes";
          // This is used to allow the program to produce random multiplication problems
          // as long as the user wnats too.
          while (userResponse.equalsIgnoreCase("yes"))
          { 
              int Num1 = Math.abs(generator.nextInt())%12 + 1;
              int Num2 = Math.abs(generator.nextInt())%12 + 1; 
              int Num3 = (Num1*Num2);
              int Num4= 0;
              while (Num4  != (Num1*Num2))
              {
              System.out.print("What is the product of " + (Num1) + " and " + (Num2) + ":");
              Num4 = Keyboard.readInt();
              //This if-then Statement will tell the user whether or not they got the answer correc
              if (Num3 == Num4)
                  {
                  System.out.println("Congratulations You got the answer!!!");
                  System.out.print("Would you like another? ");
                  userResponse = Keyboard.readString();  
                  }
              else  {
                    System.out.println("Try Again");
                    userResponse = "yes";
                    }
              }
           }         
   }
}