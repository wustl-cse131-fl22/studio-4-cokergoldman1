package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
	StdDraw.setPenColor(Color.blue);
	StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
	
	StdDraw.setPenColor(Color.orange);
	StdDraw.filledRectangle(0.65, 0.5, 0.15, 0.2);
	
	StdDraw.setPenColor(Color.red);
	StdDraw.filledSquare(0.25, 0.65, 0.05);
	StdDraw.filledSquare(0.25, 0.35, 0.05);
	StdDraw.setPenColor(190, 0, 0);
	StdDraw.filledSquare(0.75, 0.65, 0.05);
	
	StdDraw.setPenColor(Color.green);
	StdDraw.filledRectangle(0.43, 0.5, 0.2, 0.05);
	
	StdDraw.setPenColor(Color.black);
	double[] x = {0.23, 0.63, 0.43};
	double[] y = {0.45, 0.45, 0.55};
	StdDraw.filledPolygon(x, y);
	
	}
}