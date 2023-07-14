package day05.solved.packageTwo;

import day05.solved.packageOne.Rectangle;

public final class Square extends Rectangle {
	
	public Square(double side_length) throws Exception {
		super(side_length, side_length);
	}

}