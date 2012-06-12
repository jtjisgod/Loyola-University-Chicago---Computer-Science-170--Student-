
/***********************************************
 * This is used to find the Sum, Diffrence and *
 * Product of 2 numbers in the float variable  *
 * system.                                     *
 * @author Marc Schulz                         *
 * @version January 27, 2003                   *
/***********************************************/
import cs1.Keyboard;
public class FloatMath
{
      public static void main(String[] args)
      {
        float x, y;
        //Asks for the two numbers being calculated
        System.out.print("Enter the first number: ");
        x = Keyboard.readFloat();
        System.out.print("Enter the second number: ");
        y = Keyboard.readFloat();
        //Prints the Sum, Difference and Product of the two Numbers
        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x*y));
      }
}