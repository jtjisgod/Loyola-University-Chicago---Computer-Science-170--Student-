import java.awt.Graphics;
import java.awt.Color;

public class PascalTriangle
{
    private int[][] values;
    private int numRows;

    public PascalTriangle(int n)
    {
        numRows = n;
        values = new int[numRows][numRows];
        fillValues();
    }

    public void fillValues()
    {
        //Populate the array with the correct values for pascal's
        //triangle.  Use nested loops.
        values[0][0] = 1;
       
        for (int row=0; row<numRows; row++)
        {            
            for (int col=0; col<numRows;col++)
            {
                if (col == 0)
                {
                    values[row][col] = 1;
                }
                if (col != 0)
                    {
                        values[row][col] = (values[row-1][col-1] + values[row-1][col]);
                    }
            }
        }
        
    }
    
    public void show()
    {
        //Print the values in the array values to System.out
        //Print the values row by row using nested loops
        for (int row=0;row<numRows; row++)
        {
            for (int col=0;col<numRows;col++)
                {
                System.out.print(values[row][col]);
                }
        }
    }

    public void draw(int w, int h, Graphics g)
    {
        //Draw a graphical representation of this pascal's triangle
        //on the graphics object g
        //Start in the top left corner and fill a 
        //region w pixels wide and h pixels high
        //Use two colors - one for the even numbers and
        //a different color for the odd numbers
        int cellW = w/numRows;
        int cellH = h/numRows;

    }           

}
