import java.awt.*;
public class Card extends ArbitraryNumber
{
    private int rank;
    private String suit;
    private static int count=0;//counts the number of times the Card constructor is invoked

    /**
     * Constructor for objects of class Card
     */
    public Card(String s, int r)
    {
        s = s.trim();
        if (!s.equalsIgnoreCase("spade")&&!s.equalsIgnoreCase("club")&&
            !s.equalsIgnoreCase("heart")&&!s.equalsIgnoreCase("diamond"))
        {
            s = "spade";
        }
        if ((r < 1)||(r > 13))
        {
            r = 2;
        }
        suit = s.toLowerCase();
        rank = r;
        count++;
    }

    public static Card getRandomCard()
    {
        Card answer;  //answer is null here
        int r = (int)(Math.random()*13) + 1;
        int s = (int)(Math.random()*4) + 1;
        switch (s)
        {
            case 1:
                answer = new Card("heart", r);
                break;
            case 2:
                answer = new Card("diamond", r);
                break;
            case 3:
                answer = new Card("club",r);
                break;
            default:
                answer = new Card("spade", r);
         }
         return answer;
    }


    public static int getCount()
    {
        return count;
    }
    public String getSuit()
    {
        return suit;
    }

    public int getRank()
    {
        return rank;
    }

    public int getPoints()
    {
        int answer = rank;
        if (rank > 10)
            answer = 10;//face cards are worth 10
        return answer;
    }

    public String toString()
    {
        String answer = "";
        switch (rank)
        {
            case 1:
                answer = "Ace of " + suit;
                break;
            case 11:
                answer = "Jack of " + suit;
                break;
            case 12:
                answer = "Queen of " + suit;
                break;
            case 13:
                answer = "King of " + suit;
                break;
            default:
                answer = rank + " of " + suit;
              
       }//end of switch
       //answer = answer + "s, count = " + count;
       return answer;      
    }
    
    public boolean equals(Card c)
    {
        return (rank==c.rank)&&(suit.equals(c.suit));
    }
    
    public void setRank(int altRank)
    {
        if ((1<=altRank)&&(altRank<=13))
        {
            rank = altRank;
        }
    }
    private Color getColor()
    {
        Color answer = Color.red;
        if (suit.equalsIgnoreCase("spade")||suit.equalsIgnoreCase("club"))
            answer = Color.black;
        return answer;
    }
    
    public void draw(Graphics g, int x, int y, int w, int h)
    {
        g.setColor(this.getColor());
        g.fillRect(x, y, w, h);
        g.setColor(Color.white);
        g.fillRect(x+10, y+10, w-2*10, h-2*10);
        g.setColor(this.getColor());
        g.drawString(suit, x+20, y+20);
        g.drawString(""+rank, x+20, y+40);
    }

}
