/**
 * file : EmployeeRecordDemo.java
 * 
 * @author Christine Haught and Marc Schulz
 * @version (March 31, 2003)
 */

public class EmployeeRecordDemo
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to my program");
        
        //Create an array of 10 EmployeeRecords
        //Create 10 EmployeeRecords and put them in the array
        //You must use and array of EmployeeRecords
        //You write this code
        EmployeeRecord[] workers = new EmployeeRecord[10];
        workers[0] = new EmployeeRecord ("Marc");
        workers[1] = new EmployeeRecord ("Travis");
        workers[2] = new EmployeeRecord ("Dan");
        workers[3] = new EmployeeRecord ("Brendan");
        workers[4] = new EmployeeRecord ("Christina");
        workers[5] = new EmployeeRecord ("Maria");
        workers[6] = new EmployeeRecord ("Stephanie");
        workers[7] = new EmployeeRecord ("Jim");
        workers[8] = new EmployeeRecord ("Eric");
        workers[9] = new EmployeeRecord ("Chris");
        System.out.println("I have created ten employee records.");
        
        //Display the records created using a for loop
        for(int i=0; i < workers.length; i++)
           {
                System.out.println(workers[i].getName());
           }

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
                    EmployeeRecord r = chooseRecord(workers);
                    for (int day = 0; day < 7; day++)
                    {
                        System.out.print("How many hours did " + r.getName() + " work on day " + intToDay(day) + "? >");
                        int h = Keyboard.readInt();
                        r.setHours(day, h);
                    }
                    break;
                case 'w' :
                    //your code here for case h
                    r = chooseRecord(workers);
                    System.out.print("What is " + r.getName() + "'s new hourly wage? >");
                    double w = Keyboard.readDouble();
                    r.setHourlyWage(w);
                    break;
                case 'd' :
                    //your code here for case h
                    r = chooseRecord(workers);
                    displayRecord(r);
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
        System.out.println("\tHourly wage : " + r.getHourlyWage());
        System.out.println("\tHours worked : " + r.getHours());
        System.out.println("\tPay : " + r.computeWeeklyPay());
    } //end of  displayRecord  
    
    public static void showMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("The options are : ");
        System.out.println("\tSet an employee's number of hours worked. - Type h");
        System.out.println("\tSet an employee's hourly wage. - Type w");       
        System.out.println("\tDisplay an employee's record. - Type d");
        System.out.println("\tQuit. - Type q");
     } //end of showMenu
     
     public static EmployeeRecord chooseRecord(EmployeeRecord[] a)
     {
        EmployeeRecord answer = null;
        System.out.print("Type the name of the employee : ");
        String name = Keyboard.readString();
        //Write the code to search the array to find an EmployeeRecord with name
        //matching the name the user typed.  Make answer equal to that EmployeeRecord
        //If there is no such record, make answer = null
        
        for(int i=0; i<a.length; i++) 
             { 
                  if (a[i].equals(name)) 
                    { 
                      answer = a[i]; 
                      i = a.length;
                      return answer; 
                    } 
                    return answer;
              }      
             
       while (answer == null)
        {
            //name was not in list
            System.out.println(name + " is not in my list.");
            System.out.println("The available names are : ");
            for (int i=0; i<a.length; i++)
            {
                System.out.println(a[i].getName());
            }
            System.out.print("Type the name of the employee : ");
            name = Keyboard.readString();
            //your code again
            for(int i=0; i<a.length; i++) 
             { 
                  if (a[i].equals(name)) 
                    { 
                      answer = a[i]; 
                      i = a.length;
                      return answer; 
                    } 
                  return answer;
             }      
       }
        return answer;
      } //end of chooseRecord

      public static String intToDay(int i)
      {
        String answer = null ;
        //Use a switch statement to convert the integers 0..6 to the days of the week
        //Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
        switch (i)
        {
                case '0' :
                     answer.equals("Sunday");
                     break;
                case '1' :
                     answer.equals("Monday");
                     break;
                case '2' :
                     answer.equals("Tuesday");
                     break;
                case '3' :
                     answer.equals("Wednesday");
                     break;
                case '4' :
                     answer.equals("Thursday");
                     break;
                case '5' :
                     answer.equals("Friday");
                     break;
                case '6' :
                     answer.equals("Saturday");
                     break;
       }
        return answer;
     }
}//end of class EmployeeRecordDemo
