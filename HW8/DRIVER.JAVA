
/**
 * Write a description of class driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class driver
{ 
  public static void main(String[] args)
        {   
           DeckOfCards myDeck = new DeckOfCards();
           for(int i=0; i<52; i++)
           {
           System.out.println(myDeck.deal());
           System.out.println("There are " + (myDeck.getNumLeft()+1) + " cards left.");
           }
        }
}