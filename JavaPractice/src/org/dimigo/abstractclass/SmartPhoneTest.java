/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone [] phones = {
				new IPhone("iphone 6","애플",700000),
				new Galaxy("갤럭시 S6","삼성",650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			if( phone instanceof IPhone) {
				IPhone i = (IPhone) phone;
				i.useAirDrop();
			}
			
			if( phone instanceof Galaxy) {
				Galaxy g = (Galaxy) phone;
				g.useWirelessCharging();
			}
			
			phone.turnOff();
			System.out.println();
		}
		
		
		

	}

}
