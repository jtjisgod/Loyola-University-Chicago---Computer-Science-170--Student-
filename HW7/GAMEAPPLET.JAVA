
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 * This Game is a six sided dice game where players compete to get to 500 in the 
 * least number of turns
 *
 * @author Marc Schulz
 * @version March, 18 2003
 */
public class GameApplet extends Applet implements MouseListener
{
	private Player a, b;


    public void init() //Creates the 2 players
    {
        a = new Player("Marc");
        b = new Player("Christina");
        addMouseListener (this);
    }
   public void paint(Graphics g)//paints the applet 
	{ if ((a.getScore() < 500) || (b.getScore() < 500))
	  {
		setBackground(Color.blue);
        setSize(400, 400);
        a.draw(g, 5, 5, 190, 230);
        b.draw(g, 205, 5, 190, 230);
       }
       else
       {  if (a.getTurns() < b.getTurns())//prints out the winner depending on number of turns
          g.drawString("The winner is " + a.getName(),20,20);
          else 
          g.drawString("The winner is " + b.getName(),20,20); 
       }

    }
 public void mouseClicked (MouseEvent e)//click on specific spaces of applet will roll the die
   { 
        if ((e.getX() < 200)&&(e.getY() < 200)&&(a.getScore() < 500))
            a.takeTurn();
        else if ((e.getX() > 200)&&(e.getY() < 200)&&(b.getScore() < 500))
            b.takeTurn();
        repaint();
        
        
   }
   
   public void mousePressed (MouseEvent event) {}
   public void mouseReleased (MouseEvent event) {}
   public void mouseEntered (MouseEvent event) {}
   public void mouseExited (MouseEvent event) {}
}