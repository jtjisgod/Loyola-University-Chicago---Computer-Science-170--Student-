/**
 *Creates a checkerboard with 8 black checkers and 5 red ones
 *and stores them in an array.
 * 
 * @author Marc Schulz 
 * @version April, 15, 2003
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Checkers23 extends Applet 
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
        board[2][2]=BB;
        board[3][3]=BB;
        board[6][2]=BB;
        board[6][6]=BB;
        board[3][5]=BB;
        board[4][2]=BB;
        board[6][4]=BB;
        board[1][1]=BB;
        board[2][6]=RR;
        board[3][1]=RR;
        board[0][0]=RR; 
        board[5][5]=RR; 
        board[2][4]=RR; 
     }
     
     public void paint (Graphics g)
     {
       setSize(WIDTH, HEIGHT);
       drawBoard(g);
       drawCheckers(g);
       
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
}