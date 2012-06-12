
/**************************************************
 * Use to Calculate the Distance between two (x,y)*                       
 * Coordinates                                    *                                      
 *                                                *                                              
 * @author Marc Schulz                            *                                
 * @version January 27, 2003                      *                             
/**************************************************/
import cs1.Keyboard;
import java.math.*;

public class DistanceFormula
{
    public static void main(String[] args)
    { 
       double SquareRoot;
       double x1, y1, x2, y2, x3, x4;
       //Asks for the Value of the first (x,y) set
       System.out.print("Enter a value for x1: ");
       x1 = Keyboard.readDouble();
       System.out.print("Enter a value for y1: ");
       y1 = Keyboard.readDouble();
       //Asks for the Value 
       System.out.print("Enter a value for x2: ");
       x2 = Keyboard.readDouble();
       System.out.print("Enter a value for y2: ");
       y2 = Keyboard.readDouble();
       //Prints out the Distance between the two (x,y) points
       SquareRoot = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
       System.out.println("The distance between the two points is: " + SquareRoot);
       }
}
      

       
     
       


	