/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Circle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class Circle extends Figure {

	private int radius=0;
	
	public Circle(int radius) {
		super(0,0);
		this.radius = radius;
	}

	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return radius*radius*3.14;
	}

//	protected void printCenter() {
//		System.out.println("원의 중심좌표 : (" + centerX + "," + centerY + ")");
//	}
	
}