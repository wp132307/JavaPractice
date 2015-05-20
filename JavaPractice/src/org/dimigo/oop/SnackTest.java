/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snackArr = {
				new Snack("새우깡","농심",1100,2),
				new Snack("콘칩","크라운",1200,1),
				new Snack("허니버터칩","해태",1500,4)
		};
		
		for(Snack snack : snackArr) {
			snack.printSnack();
		}
		System.out.println("총 구매 금액 : " + String.format("%,d원",snackArr[0].calcPrice() + snackArr[1].calcPrice() + snackArr[2].calcPrice()));
		
		
	}

}
