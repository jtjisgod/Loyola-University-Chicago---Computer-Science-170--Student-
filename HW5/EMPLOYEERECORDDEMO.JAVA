/**
 * file : EmployeeRecordDemoSolution.java
 * 
 * @author Christine Haught and (your name here)
 * @version (February 9, 2003)
 */
import cs1.Keyboard;
public class EmployeeRecordDemo
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to my program");
        EmployeeRecord a = new EmployeeRecord("Alice", 10.75);  //you may change these values
        EmployeeRecord b = new EmployeeRecord("Betty", 15.30);  //you may change these values
        
        System.out.println("I have created two employee records.");
        
        //Display the records created
        displayRecord(a);
        displayRecord(b);

        //Show menu
        showMenu();

        //read user choice
        char choice = Keyboard.readChar();
        while (choice != 'q')
        {
            //perform user choice
            switch (choice)
            {
                case 'h' :
                    //your code here for case h
                    EmployeeRecord r = chooseRecord(a,b);
                    System.out.print("How many hours did " + r.getName() + " work? >");
                    int h = Keyboard.readInt();
                    r.setHours(h);
                    break;
                case 'w' :
                    //your code here for case h
                    r = chooseRecord(a,b);
                    System.out.print("What is " + r.getName() + "'s new wage? >");
                    double w = Keyboard.readDouble();
                    r.setWage(w);
                    break;
                case 'd' :
                    //your code here for case h
                    r = chooseRecord(a,b);
                    displayRecord(r);
                    break;  
                case 'l' :
                    //your code here for case l
                    r = chooseRecord(a,b);
                    System.out.print("What is " + r.getName() + "'s number of times late? >");
                    int l = Keyboard.readInt();
                    r.setLate(l);
                    break;
                default :
                    //your code here for default
                    System.out.println("I don't understand " + choice + ".  Please try something else.");
                    
            }//end of switch
            
            //show menu again
            showMenu();
            //read user choice for the next time through the loop
            choice = Keyboard.readChar();
          
         }//end of while loop
         System.out.println("Goodbye.");
    }//end of main
    
    
    public static void displayRecord(EmployeeRecord r)
    {
        System.out.println("\tName : " + r.getName());
        System.out.println("\tHourly wage : " + r.getWage());
        System.out.println("\tHours worked : " + r.getHours());
        System.out.println("\tTimes late : " + r.getLate());
        System.out.println("\tPay : " + r.computePay());
    } //end of  displayRecord  
    
    public static void showMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("The options are : ");
        System.out.println("\tSet an employee's number of hours worked. - Type h");
        System.out.println("\tSet an employee's hourly wage. - Type w");       
        System.out.println("\tSet number of times Late. - Type l");
        System.out.println("\tDisplay an employee's record. - Type d");
        System.out.println("\tQuit. - Type q");
     } //end of showMenu
     
     public static EmployeeRecord chooseRecord(EmployeeRecord a, EmployeeRecord b)
     {
        EmployeeRecord answer;
        System.out.print("Which employee? Type " + a.getName().toLowerCase().charAt(0) + " for " + a.getName());
        System.out.println(".  Type " + b.getName().toLowerCase().charAt(0) + " for " + b.getName());
        char who = Keyboard.readChar();
        if (who == a.getName().toLowerCase().charAt(0))
           answer = a;
        else
           answer = b;
       return answer;
      } //end of chooseRecord

        
}//end of class EmployeeRecordDemo

