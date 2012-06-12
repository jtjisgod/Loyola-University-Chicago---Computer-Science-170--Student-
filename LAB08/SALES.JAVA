// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************

public class Sales
{
    public static void main(String[] args)
    {
    System.out.print("How may Employees are there? ");
    int SALESPEOPLE;
    SALESPEOPLE = Keyboard.readInt();
    int[] sales = new int[SALESPEOPLE];
    int sum;
    int Average;
    int MaxSale;
    int MinSale;
    int WhoDoneIt;
    MaxSale = 0;
    MinSale = 999999;
    int MaxSalesPerson = -1;
    int MinSalesPerson = -1;
    for (int i=0; i<sales.length; i++)
        {
        System.out.print("Enter sales for salesperson " + (i+1) + ": ");
        sales[i] = Keyboard.readInt();
        if (sales[i] > MaxSale)
        {
            MaxSale = sales[i];
            MaxSalesPerson = i;
        }
        if (sales[i] < MinSale)
        {
            MinSale = sales[i];
            MinSalesPerson = i;
        }
       }
            
    System.out.println("\nSalesperson   Sales");
    System.out.println("--------------------");
    sum = 0;
    Average = 0;
    
    for (int i=0; i<sales.length; i++)
        {
        System.out.println("     " + (i+1) + "         " + sales[i]);
        sum += sales[i];
        Average = sum/SALESPEOPLE;
        }

    System.out.println("\nTotal sales: " + sum);
    System.out.println("\nAverage sale: " + Average);
    System.out.println("\nSalesPerson " + (MaxSalesPerson+1) + " had the highest sale with " + MaxSale); 
    System.out.println("\nSalesPerson " + (MinSalesPerson+1) + " had the lowest sale with " + MinSale);
    System.out.print("\nEnter a amount: ");
    WhoDoneIt = Keyboard.readInt();
    int count = 0;
    for (int i=0; i<sales.length; i++)
        {
            if ( sales[i] > WhoDoneIt)
            {
            System.out.println("Salesperson " + (i+1) + " Exceeded the Entered amount with a Balance of " + sales[i]);
            count++;
            }
        }
        System.out.println(count + " People got sales higher than the entered amount!!!");
    }
}



