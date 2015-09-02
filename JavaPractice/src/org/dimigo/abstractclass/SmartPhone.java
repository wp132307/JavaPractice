/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model +"의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model +"의 전원을 끕니다.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(SmartPhone phone) {
		System.out.println(phone);
	}

	public String toString() {
		return "모델명 : " + model + ", 회사명 : " + company
				+ ", 가격 : " + price +"원";
	}
	
	
	
}
