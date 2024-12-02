//Erin Check

import java.awt.*;
import javax.swing.*;
import java.util.*;
public class SierpinskisTriangle extends Canvas{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Sierpinski's Triangle");
		frame.setSize(900,900);
		SierpinskisTriangle sp = new SierpinskisTriangle();
		frame.add(sp);
		frame.setVisible(true);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void paint(Graphics g)
	{
		//draws main triange
		int side = getSize().height;
		g.setColor(Color.black);
		int [] x = new int[] {0, side/2, side};
		int [] y = new int[] {side, 0, side};
		g.fillPolygon(x, y, 3);
		g.setColor(Color.white);
		drawTriangle(0, 0, side, g);
	}
	
	
	public void drawTriangle(int x, int y, int side, Graphics g)
	{
		//gives the coordinates for where to draw the triangles
		int [] xIs = new int [] {x+side/4, x+(side*3)/4, x+side/2};
		int [] yIs = new int [] {y+side/2, y+side/2, y+side};
		g.fillPolygon(xIs, yIs, 3);
		if(side >= 4)
		{
			//left
			drawTriangle(x,y+side/2,side/2,g);
			//top
			drawTriangle(x+side/4, y, side/2, g);
			//right
			drawTriangle(x+side/2, y+side/2, side/2, g);

		}
	}
}
