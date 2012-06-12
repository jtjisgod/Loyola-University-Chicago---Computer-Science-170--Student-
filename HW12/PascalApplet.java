import java.applet.Applet;
import java.awt.*;

public class PascalApplet extends Applet
{
	private PascalTriangle triangle;
	private int WIDTH = 500;
	private int HEIGHT = 500;

	public void init()
	{
		triangle = new PascalTriangle(100);
		setSize(WIDTH, HEIGHT);
	}

	public void paint(Graphics g)
	{
		triangle.draw(WIDTH, HEIGHT, g);
	}

}
