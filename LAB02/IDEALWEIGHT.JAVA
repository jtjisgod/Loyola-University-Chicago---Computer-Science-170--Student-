
/**
 * Used to calculate the ideal weight of both males and females depending on their size
 * 
 * @author Marc Schulz
 * @version Febuary 4, 2003
 */
import cs1.Keyboard;
public class IdealWeight
{
    public static void main(String[] args)
        { int Feet;
          int Inches;
          double totalInches;
          double Female;
          double Male;
          
            { System.out.print("How tall are you in feet? ");
              Feet = Keyboard.readInt();
              System.out.print("How tall are you in inches? ");
              Inches = Keyboard.readInt();
              totalInches = ((Feet*12)+ Inches);
              System.out.println("You are " + totalInches + " inches tall");
              Female = (100 + ((totalInches - 60)*5));
              System.out.println("The ideal Female weight for your size is " + Female + "Pounds");
              Male = (106 + ((totalInches - 60)*6));
              System.out.println("The ideal Male Weight for your size is " + Male + "Pounds");
             }
         }
}