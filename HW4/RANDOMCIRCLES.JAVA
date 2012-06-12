import java.applet.Applet; 
import java.awt.*;
import java.util.Random;

public class RandomCircles extends Applet
{

    public void paint(Graphics page)
    {
        final int MAX_DIAMETER = 50, MAX_CIRCLES= 10, MAX_X = 350, MAX_Y = 250;
        int x, y, diameter, BigX = 0, LDiameter = 0;
        
        Random generator = new Random();
        setBackground(Color.black);
       
       for (int count = 1; count < MAX_CIRCLES; count++)
        {
          //generates the random location of the circles.
          x = generator.nextInt(MAX_X) + 1;
          y = generator.nextInt(MAX_Y) + 1;
          
          //Generates the random diameter of each circle.
          diameter = generator.nextInt(MAX_DIAMETER) +1;
        //Draws the 10 random circles
         page.setColor(Color.white);
         page.drawOval(x, y, diameter, diameter);
         //stores the biggest circles location 
         if (diameter > LDiameter)
            {
             BigX = x;
             LDiameter = diameter;
            }
         }
        //Re-colors the biggest circle RED
        page.setColor(Color.red);
        page.fillOval(BigX, MAX_DIAMETER-LDiameter,LDiameter,LDiameter);
    }
}
        
        
        
     
 