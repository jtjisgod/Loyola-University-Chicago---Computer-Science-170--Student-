
/**********************************************************************************************
 *  Display one multiplication problem.  Ask the user for the answer.  If the correct answer  *
 *  is given, display a   “Good job” message and exit.  If a wrong answer is given, gently     *
 *  tell the user to try again.  The user has to keep trying until he or she gets the right   *
 *  answer.                                                                                   *
 *                                                                                            *
 * @author Marc Schulz                                                                        *
 * @version February 10, 2003                                                                 * 
 **********************************************************************************************/

import cs1.Keyboard; 
import java.util.Random;
public class MathDrillA
{  public static void main(String[] args)
   {
        Random generator = new Random();  
        int Num4= 0;
        int Num1 = Math.abs(generator.nextInt())%12 + 1;
        int Num2 = Math.abs(generator.nextInt())%12 + 1; 
        int Num3 = (Num1*Num2);
        //This will keep the commands repeating until the user gets the right answer.
        while (Num4  != (Num1*Num2))
        {
         // First question that is asked, calls upon the random generator to produce Num1 and Num2
         System.out.print("What is the product of " + (Num1) + " and " + (Num2) + ":");
         Num4 = Keyboard.readInt();
          if (Num3 == Num4)
             System.out.println("Congratulations You got the answer!!!");
          else
              System.out.println("Try Again");
        }
    }
}
              