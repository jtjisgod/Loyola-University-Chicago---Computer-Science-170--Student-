
/***********************************************************
 * Creates 52 Cards in a Deck and allows you to draw them
 * 
 * @author  Marc Schulz
 * @version March 25, 2003
 */
public class DeckOfCards  
{   private Card[] d;
    private int cardCount;
    
    
    public Card DeckofCards()
    {
        d = new Card[52];
        int i = 0;
        cardCount = 52; 
        for(int r=1; r<=13; r++)
        {
            d[i] = new Card("diamond",r );
            i++;
        }
        for(int r=1; r<=13; r++)
        {
            d[i] = new Card("Club", r);
            i++;
        }
        for(int r=1; r<=13; r++)
        {
            d[i] = new Card("Heart", r);
            i++;
        }
        for(int r=1; r<=13; r++)
        {
            d[i] = new Card("Spade", r);
            i++;
        }
        return d[cardCount] ;
    }
     
     
     
     public Card deal()
     {
        Card c = d[cardCount];
        cardCount--;
        return c;
     }
     
     
     public int  getNumLeft()
     {
      return cardCount;
     }
}