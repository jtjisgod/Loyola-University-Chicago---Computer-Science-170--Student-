// ****************************************************************
// DrawPerson.java
//
// An applet that uses the Graphics draw methods to draw a person.
//          
// ****************************************************************
import java.awt.*;
import java.applet.Applet;

public class DrawPerson extends Applet{


    private final int APPLET_WIDTH = 600;
    private final int APPLET_HEIGHT = 400;

    private int[] shirtX = {60,0,20,60,50,130,120,160,180,120};
    private int[] shirtY = {100,150,180,160,250,250,160,180,150,100};
    private int[] pantsY = {250,250,500,500,350,500,500};
    private int[] pantsX = {50,130,170,130,90,50,25};
    private int headX = 65;
    private int headY = 52;
   //private int[] hairX = {60,55,60,120,130,125,45,65};
   //private int[] hairY = {75,75,40,40,75,75,115,115};
   private int[] zagX = {60,120,50};
   private int[] zagY = {100,160,250};
    //--------------------------------------
    // Set applet size
    //--------------------------------------
    public void init()
    {
	setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }

    //--------------------------------------
    // Draw person
    //--------------------------------------
    public void paint (Graphics page)
    {
	for(int i=0; i<3; i++)
	{
	page.setColor(Color.blue);
	page.fillPolygon(shirtX, shirtY, shirtX.length);
	page.setColor(Color.black);
	page.fillPolygon(pantsX, pantsY, pantsX.length);
    page.fillOval(headX, headY, 50, 50);
    page.setColor(Color.yellow);
    //page.fillPolygon(hairX,hairY, hairX.length);
    page.setColor(Color.red);
    page.drawPolyline(zagX, zagY, zagX.length);
    movePersocd(175,0);
    }
    }
 public void movePersocd(int x, int y)
 {
   for(int i=0; i<shirtX.length; i++)
   {
     shirtX[i] = shirtX[i] +x;
   }
   for(int i=0; i<pantsX.length; i++)
    {
    pantsX[i] = pantsX[i] +x;
     }
    headX = headX +x;
   for(int i=0; i<zagX.length; i++)
   {
     zagX[i] = zagX[i] + x;
   } 
   for(int i=0; i<shirtY.length; i++)
   {
     shirtY[i] = shirtY[i] +y;
   }
   for(int i=0; i<pantsY.length; i++)
    {
    pantsY[i] = pantsY[i] +y;
     }
    headY = headY +y;
   for(int i=0; i<zagX.length; i++)
   {
     zagY[i] = zagY[i] + y;
   } 
   
  }
}
   
   
   
   








