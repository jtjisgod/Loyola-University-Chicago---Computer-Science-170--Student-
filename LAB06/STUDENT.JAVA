// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and print student's name.
// ****************************************************************

public class Student
{
    //declare instance data 
    private String name;
    private double test1;
    private double test2;
    private double Average;

    //constructor
    public Student(String studentName)
    {
      name = studentName;
      test1 = 0;
      test2 = 0;
      Average = 0;
    }

    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    public void inputGrades()
    {
    System.out.print("Enter's " + name + " score for test1: ");
    test1 = Keyboard.readDouble();
    while ((test1 > 100) || (test1 < 0))
    {
     System.out.print("Incorrect Grade, Enter Another: ");
     test1 = Keyboard.readDouble();
    }
    System.out.print("Enter's " + name + " score for test2: ");
    test2 = Keyboard.readDouble();
    while ((test2 > 100) || (test2 < 0))
    {
     System.out.print("Incorrect Grade, Enter Another: ");
     test2 = Keyboard.readDouble();
    }
    }
    
    //getAverage: compute and return the student's test average
    public double getAverage()
    {
     Average = (test1 + test2)/2;
     return Average;
    }

    //printName: print the student's name
    public String printName()
    {
     return name;
    }
    public String toString()
    {
     return ("Name: " + name + "\t" + "Test1: " + test1 + "\t" + "Test2: " + test2);
    }

}











