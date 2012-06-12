// ****************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//          
// ****************************************************************

public class IntegerListTest{

	static IntegerList list = new IntegerList(10);

    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {

	printMenu();
	int choice = Keyboard.readInt();
	while (choice != 0)
	    {
		dispatch(choice);
		printMenu();
		choice = Keyboard.readInt();

	    }
    }


    //-------------------------------------------------------
    // Do what the menu item calls for
    //-------------------------------------------------------
    public static void dispatch(int choice)
    {
	int loc;
	int oldVal;
	int newVal;
	switch(choice)
	    {
	    case 0: 
		System.out.println("Bye!");
		break;
	    case 1:
		System.out.println("How big should the list be?");
		int size = Keyboard.readInt();
		list = new IntegerList(size);
		list.randomize();
		break;
	    case 2:
		list.selectionSort();
		break;
	    case 3:
		System.out.print("Enter the value to look for: ");
		loc = list.search(Keyboard.readInt());
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		break;
	    case 4:
	    list.sortDecreasing();
	    break;
	    case 5:
	    System.out.print("Enter the Value you want to Replace: ");
	    oldVal = Keyboard.readInt();
	    System.out.print("Enter the Value you want to Replace it with: ");
	    newVal = Keyboard.readInt();
	    list.replaceFirst(oldVal, newVal);
	    break;
	    case 6:
	    System.out.print("Enter the Value you want to Replace: ");
	    oldVal = Keyboard.readInt();
	    System.out.print("Enter the Value you want to Replace it with: ");
	    newVal = Keyboard.readInt();
	    list.replaceAll(oldVal, newVal);
	    break;
	    case 7:
		list.print();
		break;
	    
	    default:
		System.out.println("Sorry, invalid choice");
	    }
    }


    //-------------------------------------------------------
    // Print the user's choices
    //-------------------------------------------------------
    public static void printMenu()
    {

	System.out.println("\n   Menu   ");
	System.out.println("   ====");
	System.out.println("0: Quit");
	System.out.println("1: Create a new list (** do this first!! **)");
	System.out.println("2: Sort the list using selection sort in increasing order");
	System.out.println("3: Find an element in the list using sequential search");
	System.out.println("4: Sort the list using selection sort in decreasing order");
	System.out.println("5: Replace First Occuring Value");
	System.out.println("6: Replace All the Occuring Values");
	System.out.println("7: Print the list");
	System.out.print("\nEnter your choice: ");
    }


}

