/******************************************************
 * Used as a reference function of EmployeeRecordDemo.*
 *                                                    *
 * @author Marc Schulz                                *
 * @version February 18, 2003                         *
 ******************************************************/
public class EmployeeRecord
{   //Member Variables
    private String Name; 
    private double Wage;
    private double Hours;
    double Late = 0;
    double Pay = 0;
    //sets the initial Name and Wage setting
    public EmployeeRecord(String initName, double initWage)
    { 
        Name = initName;
        Wage = initWage;
        Hours = 0;
        
    }
    
    //Returns the Name to getname value string 
    public String getName()
    {
        return Name;
    }
    
    //Set the number of hours worked
    public void setHours(int h)
    {
       Hours += h;
    }

    //Set the Number of times Late
    public void setLate(int l)
    {
        Late += l;
    }
    
   //Gets the Late Times
   public double getLate()
   {
        return Late;
   }
   
   //Set a new wage
    public void setWage(double w)
    {
      Wage += w;
    }
    
    //Get the Wage
    public double getWage()
    {
        return Wage;
    }
    
    //Get the Hours
    public double getHours()
    {
        return Hours;
    }
    
   //Compute the Employee's Pay
    public double computePay()
    {
        if (Hours > 0)
            if (Hours <= 40)
            {
             Pay = (Wage*Hours)-(Late*(Wage*0.25));
            }
        else if (Hours > 40)
            {
              Pay = ((Wage*40)+((1.5*Wage)*(Hours-40)))-(Late*(Wage*0.25));
            }
     return Pay;
     }
}
    

    

    
    
    
            
          
          