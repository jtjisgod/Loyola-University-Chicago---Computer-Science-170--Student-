
/**
 * Write a description of class Name here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Name
{
private String firstName;
private String middleName;
private String lastName;
//private String Name;
//private String otherName;
private int ch;
private String a;
private String b;
private String c;
private String d;

public Name(String first, String middle, String last) 
{
 firstName = first;
 middleName = middle;
 lastName = last;
}
public String getFirst()
{ 
 return firstName;
}
public String getMiddle()
{
 return middleName;
}
public String getLast()
{
 return lastName;
}
public String firstMiddleLast()
{
 System.out.println(firstName + " " + middleName + " " + lastName);
 return firstName;
}
public String lastFirstMiddle() 
{
System.out.println(lastName + " " + firstName + " " + middleName);
return lastName;
}

public int length()
{
  ch = firstName.length() + middleName.length() + lastName.length(); 
  System.out.println(ch);
  return ch;
}
public String initials() 
{
  a = firstName.substring(0,1);
  b = middleName.substring(0,1);
  c = lastName.substring(0,1);
  d = (a + b + c);
  System.out.println(d.toUpperCase());
  return d;
}
public boolean equals(Name otherName) 
{
	if ( (firstName.equalsIgnoreCase(otherName.getFirst())) && (middleName.equalsIgnoreCase(otherName.getMiddle())) && (lastName.equalsIgnoreCase(otherName.getLast())) )
    return true;
    else 
    return false;
}
}
