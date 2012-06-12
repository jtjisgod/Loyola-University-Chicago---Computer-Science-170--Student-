// ****************************************************************
//   IntegerListBTest.java
//
//   Provides a menu-driven tester for the IntegerList class.
//   (Version B - for use with the binary search lab exerice)
//          
// ****************************************************************


public class IntegerListBTest
{

    static IntegerListB list = new IntegerListB (10);


    // ---------------------------------------------------------------
    //  Create a list, then repeatedly print the menu and do what the
    //  user asks until they quit.
    // ---------------------------------------------------------------
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


    // ----------------------------------------------------
    //  Does what the menu item calls for.
    // ----------------------------------------------------
    public static void dispatch(int choice)
    {
	int loc;
	switch(choice)
	    {
	    case 0: 
		System.out.println("Bye!");
		break;
	    case 1:
		System.out.println("How big should the list be?");
		int size = Keyboard.readInt();
		list = new IntegerListB(size);
		list.randomize();
		break;
	    case 2:
		list.selectionSort();
		break;
	    case 3:
		System.out.print("Enter the value to look for: ");
		loc = list.seqSearch(Keyboard.readInt());
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		break;
	    case 4:
		System.out.print("Enter the value to look for: ");
		loc = list.binarySearchRec(Keyboard.readInt());
		if (loc != -1)
		    System.out.println("Found at location " + loc);
		else
		    System.out.println("Not in list");
		break;
	    case 5:
		list.print();
		break;
	    default:
		System.out.println("Sorry, invalid choice");
	    }
    }


    // ----------------------------
    //  Prints the user's choices.
    // ----------------------------
    public static void printMenu()
    {

	System.out.println("\n   Menu   ");
	System.out.println("   ====");
	System.out.println("0: Quit");
	System.out.println("1: Create new list elements (** do this first!! **)");
	System.out.println("2: Sort the list using selection sort");
	System.out.println("3: Find an element in the list using sequential search");
	System.out.println("4: Find an element in the list using binary search");
	System.out.println("5: Print the list");
	System.out.print("\nEnter your choice: ");
    }

}

