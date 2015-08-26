/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ Rectangle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class Rectangle extends Figure {

	private int width=0;
	private int height=0;
	
	public Rectangle(int width, int height) {
		super(0,0);
		this.width = width;
		this.height = height;
	}
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width*height;
	}
	
//	protected void printCenter() {
//		System.out.println("사각형의 중심좌표 : (" + centerX + "," + centerY + ")");
//	}
	
}
