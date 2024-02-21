package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5,0.25,0.5,0.25);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(0.5, 0.75, 0.5, 0.25);
	}
}