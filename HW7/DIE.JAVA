//********************************************************************
//  Die.java       Author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and the number of faces on the die.
//********************************************************************
import java.awt.*;
public class Die
{
   private final int MIN_FACES = 4;

   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   //-----------------------------------------------------------------
   //  Defaults to a six-sided die. Initial face value is 1.
   //-----------------------------------------------------------------
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Explicitly sets the size of the die. Defaults to a size of
   //  six if the parameter is invalid.  Initial face value is 1. 
   //-----------------------------------------------------------------
   public Die (int faces)
   {
      if (faces < MIN_FACES)
         numFaces = 6;
      else
         numFaces = faces;

      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll ()
   {
      faceValue = (int) (Math.random() * numFaces) + 1;
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns the current die value.
   //-----------------------------------------------------------------
   public int getFaceValue ()
   {
      return faceValue;
   }
   
    public void draw(Graphics g, int x, int y, int w)
    {
        final int DOTWIDTH = 15;
        //assumes numFaces <=6
        g.setColor(Color.red);
        g.fillRect(x, y, w, w);
        g.setColor(Color.black);
        switch (faceValue)
        {
            case 1:
                g.fillOval(x+w/2-DOTWIDTH/2, y+w/2-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                break;
            case 2:
                g.fillOval(x+w/3-DOTWIDTH/2, y+w/3-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+2*w/3-DOTWIDTH/2, y+2*w/3-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                break;
            case 3:
                g.fillOval(x+w/4-DOTWIDTH/2, y+w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);  
                g.fillOval(x+2*w/4-DOTWIDTH/2, y+2*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+3*w/4-DOTWIDTH/2, y+3*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                break;
            case 4:
                g.fillOval(x+w/4-DOTWIDTH/2, y+w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);  
                g.fillOval(x+w/4-DOTWIDTH/2, y+3*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+3*w/4-DOTWIDTH/2, y+w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);            
                g.fillOval(x+3*w/4-DOTWIDTH/2, y+3*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                break;          
             case 5:
                g.fillOval(x+w/4-DOTWIDTH/2, y+w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);  
                g.fillOval(x+w/4-DOTWIDTH/2, y+3*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+3*w/4-DOTWIDTH/2, y+w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);            
                g.fillOval(x+3*w/4-DOTWIDTH/2, y+3*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+w/2-DOTWIDTH/2, y+w/2-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);      
                break; 
             case 6:
                g.fillOval(x+w/3-DOTWIDTH/2, y+w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+w/3-DOTWIDTH/2, y+2*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+w/3-DOTWIDTH/2, y+3*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+2*w/3-DOTWIDTH/2, y+w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+2*w/3-DOTWIDTH/2, y+2*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                g.fillOval(x+2*w/3-DOTWIDTH/2, y+3*w/4-DOTWIDTH/2, DOTWIDTH, DOTWIDTH);
                break;                
                
        }
        
     }
    }
