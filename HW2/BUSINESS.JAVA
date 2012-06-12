/***************************************************
 * This Program is designed to draw a Business card*
 * with my name and e-mail address on it.          *
 * @Author Marc Schulz                             *
 * @Version January 27,2002                        *
 * *************************************************/

import java.applet.Applet; 
import java.awt.*;

public class Business extends Applet
{

	public void paint(Graphics g)
	{
		// Creates the main Business Card Box with specified color
		g.setColor(Color.blue);
		g.fillRect(0, 0, 350, 250);
		// Creates the oval in the inner part of the Business Card
		g.setColor(Color.cyan);
		g.fillOval(0, 1, 347, 247);
		//Creates The Box in which the name and e-mail address will be stored
		g.setColor(Color.lightGray);
		g.fillRect(100, 100, 150, 50);
		//Prints My Name
		g.setColor(Color.red);
		g.drawString("Marc Allen Schulz", 130, 125);
		//Prints My e-mail address
		g.setColor(Color.red);
		g.drawString("Mschulz@luc.edu", 130, 135);
		//End of Applet

}
   }

	
