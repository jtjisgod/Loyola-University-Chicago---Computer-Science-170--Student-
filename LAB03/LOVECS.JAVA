// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import cs1.Keyboard;
public class LoveCS
{
    public static void main(String[] args)
    {
	int sum = 0;
    int times;
	int count = 1;
	int nextVal = 0;
    System.out.print("How many times do you want this to print? ");
    times = Keyboard.readInt();
	while (count <= times)
	    {
	    System.out.println(count + " I love Computer Science!!");
	    count++;
    
    while (nextVal < (count-1))
           {
           nextVal = nextVal + 1;
           sum = sum + nextVal;
           }
           
          }
      System.out.println("Printed this message " + (times) + " times.  The sum of the numbers from 1 to " + (count-1) + " is " + (sum) + ".");
      }
}

