import java.awt.*;
public class Player
{   //Private Member variables
    private String name;
    private Die d1;
    private Die d2;
    private Die d3;
    private Die d4;
    private int score;
    private int Turns;
    
    public Player(String initName)//creates the dice 
    {
        name = initName;
        d1 = new Die(6);
        d2 = new Die(6);
        d3 = new Die(6);
        d4 = new Die(6);
       score = 0;
       Turns = 0;
    }

    public void takeTurn()//Roll the Dice, add the score, and count the rolls taken
    {
        d1.roll();
        d2.roll();
        d3.roll();
        d4.roll();
        //System.out.println(name + " rolled " + d1.getFaceValue() + " and " + d2.getFaceValue());
        score += d1.getFaceValue() + d2.getFaceValue() + d3.getFaceValue() + d4.getFaceValue();
        Turns++;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void draw(Graphics g, int x, int y, int w, int h)
    {
        g.setColor(Color.white);
        g.fillRect(x, y, w, h);
        g.setColor(Color.black);
        g.setFont(new Font(null, 0, 16));
        g.drawString(name + " score : " + score , x+20, y+20);
        g.drawString("Turns Taken: " + Turns , x+20, y+40); 
        int s = h-30;
        if ((w-30)/2 < s)
            s = (w-30)/2;
        int extraX = w-2*s;
        int extraY = h-20-s;
        d1.draw(g, x+extraX/3, y+50, s);
        d2.draw(g, x+extraX/3+s+extraX/3, y+50, s);
        d3.draw(g, x+extraX/3, y+140, s);
        d4.draw(g, x+extraX/3+s+extraX/3, y+140, s);
       
    }
    
    public double getTurns()
    {
        return Turns;
    }
   
}