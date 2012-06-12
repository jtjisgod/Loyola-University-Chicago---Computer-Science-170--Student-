/**
 * Creates Checker Board with 8 black and 5 red checkers
 * and stores them in an array. I talos checks to see if there are
 * any Jumps Possible.
 *
 * 
 * @author Marc Schulz
 * @version April 15, 2003
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Checkers24 extends Applet 
{
     int[][] board;
     final int WIDTH = 500; 
     final int HEIGHT = 500;
     final int EMPTY = 0;
     final int BB = 1;
     final int RR = 2;
     final int SIZE = 7;
     final int S=WIDTH/SIZE;
     
     public void init ()
     {
        board = new int[SIZE][SIZE];
        board[5][1]=BB;
        board[3][3]=BB;
        board[2][2]=BB;
        board[6][2]=BB;
        board[6][6]=BB;
        board[3][5]=BB;
        board[1][3]=RR;
        board[1][1]=RR;
        board[3][1]=RR;
        board[4][2]=RR; 
        board[2][4]=RR;
     }
     
     public void paint (Graphics g)
     {
       setSize(WIDTH, HEIGHT);
       drawBoard(g);
       drawCheckers(g);
       checkJumps(g);
     }
     
     public void drawBoard (Graphics g)
     {
        for (int row =0; row<SIZE; row++)
        {
           for (int col=0;col<SIZE;col++)
           {
            
            if((row+col)%2 == 0)
              { 
                  g.setColor(Color.black);
                  g.fillRect(S*col, S*row,S,S);
              }
            else
                {
                    g.setColor(Color.red);
                    g.fillRect(S*col,S*row,S,S);
                }
            }
            
            
        }
     }
     public void drawCheckers(Graphics g)
     {
        for (int row = 0; row < SIZE; row++)
        {
            for (int col = 0; col < SIZE; col++)
            {
                if (board[row][col]==BB)
                    drawBlackChecker(g, col*S, row*S);
                else if (board[row][col]==RR)
                    drawRedChecker(g, col*S, row*S);
            }
        }
     }
  
     public void drawRedChecker(Graphics g, int x, int y)
     {
        g.setColor(Color.red);
        g.fillOval(x, y, S, S);
        g.setColor(Color.white);
        g.drawOval(x,y,S,S);
     }
     public void drawBlackChecker(Graphics g, int x, int y)
     {
        g.setColor(Color.black);
        g.fillOval(x, y, S, S);
        g.setColor(Color.white);
        g.drawOval(x,y,S,S);

     }
     public void checkJumps(Graphics g)
     {
        int draw = 50;
        for (int row=0; row <SIZE; row++)
        
        {
            for (int col=0; col<SIZE; col++)
            {   
                if (board[row][col] == BB)
                {
                //Check Northwest Square 
                if ((board[row-1][col-1] == RR)&&(board[row-2][col-2] ==  EMPTY))
                {
                g.drawString("Black Checker at row " + row +" col "+ col + " can jump the red Checker at row "+(row-1)+" col "+(col-1),50,draw);
                draw = draw + 30;
                }
                //Check Northeast Square
                if ((board[row-1][col+1] == RR)&&(board[row-2][col+2] ==  EMPTY))
                {
                g.drawString("Black Checker at row " + row +" col "+ col + " can jump the red Checker at row "+(row-1)+" col "+(col+1),50,draw);
                draw = draw +30;
                }
                //Check SouthWest Square 
                if ((board[row+1][col-1] == RR)&&(board[row+2][col-2] ==  EMPTY))
                {
                g.drawString("Black Checker at row " + row +" col "+ col + " can jump the red Checker at row "+(row+1)+" col "+(col-1),50,draw);
                 draw = draw + 30;
                }
                //Check SouthEast Square
                if ((board[row+1][col+1] == RR)&&(board[row+2][col+2] ==  EMPTY))
                {
                g.drawString("Black Checker at row " + row +" col "+ col + " can jump the red Checker at row "+(row+1)+" col "+(col+1),50,draw);
                draw = draw + 30;
                }
                }
                if (board[row][col] == RR)
                {
                //Check Northwest Square 
                if ((board[row-1][col-1] == BB)&&(board[row-2][col-2] ==  EMPTY))
                {
                g.drawString("Red Checker at row " + row +" col "+ col + " can jump the Black Checker at row "+(row-1)+" col "+(col-1),50,draw);
                 draw = draw + 30;
                }
                //Check Northeast Square
                if ((board[row-1][col+1] == BB)&&(board[row-2][col+2] ==  EMPTY))
                {
                g.drawString("Red Checker at row " + row +" col "+ col + " can jump the Black Checker at row "+(row-1)+" col "+(col+1),50,draw);
                 draw = draw + 30;
                }
                //Check SouthWest Square 
                if ((board[row+1][col-1] == BB)&&(board[row+2][col-2] ==  EMPTY))
                {
                g.drawString("Red Checker at row " + row +" col "+ col + " can jump the Black Checker at row "+(row+1)+" col "+(col-1),50,draw);
                 draw = draw + 30;
                }
                //Check SouthEast Square
                if ((board[row+1][col+1] == BB)&&(board[row+2][col+2] ==  EMPTY))
                {
                g.drawString("Red Checker at row " + row +" col "+ col + " can jump the Black Checker at row "+(row+1)+" col "+(col+1),50,draw);
                 draw = draw + 30;
                }
                }
            }
        }
     }
}