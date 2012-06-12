//***********************************************************************
//* Welcome to Marcbot. A semi-artificial lifeform with several built in* 
//* responses The purpose of this Program is to take user imputted text *
//* and compare it with predefinded answers and to give the appropriate *
//* response.                                                           *
//*                                                                     *
//* Author @Marc Schulz (MajinMarc)                                     *
//* Version @0.1 Beta                                                   *
//* Release Date @February 4th, 2003                                    * 
//***********************************************************************/

import cs1.Keyboard;

public class ArtificialIntelligence
{
    public static void main(String[] args)
    { 
      String userResponse;
      String userName = "";
      String answer = "no";
	  while (answer.equalsIgnoreCase("no"))
        
        {     //Initial Statement by the Bot 
              System.out.print("What did you want to say to me? ");
              userResponse = Keyboard.readString();
              //If the User Says "Hello" Then the bot will respond to it 
               if (userResponse.equalsIgnoreCase("Hello"))
                   {
                    System.out.println("Hello " + (userName));
                    answer = "no";
                    }
               //If the User says Goodbye it will Respond With this. 
               else if   (userResponse.equalsIgnoreCase("Goodbye"))
                     { System.out.println("Goodbye and thank you for talking to me " + (userName) + ".");
			         answer = "yes" ;
			         }
			   //If the user asks the bot it's Name, it will respond with its name and ask the user his/hers
			   else if (userResponse.equalsIgnoreCase("What is your name?"))
			           { System.out.println("My name is MarcBot. What's yours?");
			             userName = Keyboard.readString();
			             answer = "no";
			             System.out.println("Hello " + (userName) + "!!!");
			           }
			   //If the User types in all UPPERCASE. Then a response for yelling is given.        
			   else if (userResponse.equals(userResponse.toUpperCase()))
			            { System.out.println("Stop Yelling at me " + (userName) + "!!");
			              answer = "no";
			            }
			   // Give a Question that does not have a pre-defined answer it will answer with this.         
			   else if (userResponse.indexOf("?") >=0) 
                  { System.out.println("I Don't Understand the question " + (userName) + ".");
                    answer = "no";
                  } 
               //if it's a statement that has no pre-defined answer, it will answer with this.   
               else 
                  { System.out.println("Really " + (userName) + "?");
                    answer = "no";
                  }
              
         }
      }
}
         
			             
			    
			         
               
  

      
  