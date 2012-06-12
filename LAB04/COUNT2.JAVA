// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import cs1.Keyboard;

public class Count2
{
  public static void main (String[] args)
  { 
      
      String phrase = "continue";    // a string of characters
      int countBlank;   // the number of blanks (spaces) in the phrase 
      int length;       // the length of the phrase
      char ch;          // an individual character in the string
      
                      
        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();
         while (phrase != ("quit"))                    
      {   
        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase. Type quit to end program: ");
        phrase = Keyboard.readString();
        if ( phrase.equalsIgnoreCase("quit"))
            phrase = "quit";
        else
        {    
        length = phrase.length();

        // Initialize counts
        countBlank = 0;
        int i = 0;
        int countA = 0;
        int countE = 0;
        int countS = 0;
        int countT = 0;
        // a for loop to go through the string character by character
        // and count the blank spaces
        for (ch = phrase.charAt(i); i < length; i++  )
        {     
            switch (phrase.charAt(i))
            {
            case 'a':
            case 'A':  countA++;
                      break;
            case 'e':
            case 'E': countE++;
                     break;
            case 's':
            case 'S': countS++;
                     break;
            case 't':
            case 'T': countT++;
                     break;
            case ' ': countBlank++;
                     break;
            default: 
                    countA = countA;
                    countE = countE;
                    countS = countS;
                    countT = countT;
                    countBlank = countBlank;
            }
         } 

        // Print the results
        System.out.println ();
        System.out.println ("Number of blank spaces: " + countBlank);
        System.out.println ("Number of A's: " + countA);
        System.out.println ("Number of E's: " + countE);
        System.out.println ("Number of S's: " + countS);
        System.out.println ("Number of T's: " + countT);
        System.out.println ();
        }
        }
       }
}



