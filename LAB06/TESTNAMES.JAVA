
/**
 * Write a description of class TestNames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestNames
{   
    public static void main(String[] args)
    { 
    String NameFirst;
    String NameMiddle;
    String NameLast;
    String NameFirst2;
    String NameMiddle2;
    String NameLast2;
    System.out.print("Enter a name (First): ");
	NameFirst = Keyboard.readString();
	System.out.print("Enter a name (Middle): ");
	NameMiddle = Keyboard.readString();
	System.out.print("Enter a name (Last): ");
	NameLast = Keyboard.readString();
	System.out.print("Enter a name (First): ");
	NameFirst2 = Keyboard.readString();
	System.out.print("Enter a name (Middle): ");
	NameMiddle2 = Keyboard.readString();
	System.out.print("Enter a name (Last): ");
	NameLast2 = Keyboard.readString();
	Name name1 = new Name(NameFirst, NameMiddle, NameLast);
	Name name2 = new Name(NameFirst2, NameMiddle2, NameLast2); 
	name1.firstMiddleLast();
	name2.firstMiddleLast();
	name1.lastFirstMiddle();
	name2.lastFirstMiddle();
    name1.initials();
    name2.initials();
    name1.length();
    name2.length();
    
}
}
	
