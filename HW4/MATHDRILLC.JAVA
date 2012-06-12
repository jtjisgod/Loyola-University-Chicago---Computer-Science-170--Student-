
/*****************************************************************************************
 *Generate lots of problems for the user to solve.  For each individual problem the user * 
 *has to keep trying until he or she gets it right.  You should generate each problem    *
 *randomly.Be sure to work out how the program should terminate, and make that clear     *
 *to the user. This program also gives the user the option to give up the program        *
 *after 3 tries.                                                                         *
 *                                                                                       *
 * @author Marc Schulz                                                                   *
 * @version February 10, 2003                                                            *
 *****************************************************************************************/

import cs1.Keyboard; 
import java.util.Random;
public class MathDrillC
{  public static void main(String[] args)
   {
        Random generator = new Random();  
        String userResponse = "Yes";
          while (userResponse.equalsIgnoreCase("yes"))
          { 
              int Num1 = Math.abs(generator.nextInt())%12 + 1;
              int Num2 = Math.abs(generator.nextInt())%12 + 1; 
              int Num3 = (Num1*Num2);
              int Num4= 0;
              int tries = 1;
              String cont;
              //Basic While that will make it continue the program in a loop
              while (Num4  != (Num1*Num2))
              {
              System.out.print("What is the product of " + (Num1) + " and " + (Num2) + ":");
              Num4 = Keyboard.readInt();
              if (Num3 == Num4)
                  {
                  System.out.println("Congratulations You got the answer!!!");
                  System.out.print("Would you like another? ");
                  userResponse = Keyboard.readString();  
                  }
              //Theis is a if within an if statement. if the problem is wrong this message is 
              //printed out and the tries counter is increased by one.
              if  (Num3 != Num4)
                 if (tries <3)
                    {
                    System.out.println("Try Again");
                    userResponse = "yes";
                    tries++;
                    }
              //This is the result of the tries counter reaching 3, it asks the user whether or not they 
              //wish to continue with this problem or not.
              else 
                  {
                   System.out.print("You seem to be having trouble, would you like to continue trying? ");
                   cont = Keyboard.readString();
                   if (cont.equalsIgnoreCase("yes"))
                      {
                       userResponse = "yes";
                      }
                   else
                      {
                       System.out.println("The correct answer was " + Num3 + ".");
                       System.out.print("Would you like another? ");
                       userResponse = Keyboard.readString();
                       Num4 = Num3;
                      }
                  }
              }
           }         
   }
}
 
               