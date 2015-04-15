/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class CarTest {

	
	public static void main(String[] args) {
		//Car car = new Car();
//		Car2 car = new Car2();
//		Car2 car2 = new Car2("기아자동차","K7","검정색",246,40000000);
//		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
		Car3 car = new Car3();
		Car3 car2  = new Car3("기아자동차","K7","검정색",246);
		Car3 car3 = new Car3("삼성자동차","SM7","회색");
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원", car.getPrice()));
		System.out.println();
		
//		car.setCompany("기아자동차");
//		car.setModel("K7");
//		car.setColor("흰색");
//		car.setMaxSpeed(246);
//		car.setprice(40000000);
		
		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도 : " + car2.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원", car2.getPrice()));
		System.out.println();
		
//		car.setCompany("삼성자동차");
//		car.setModel("SM7");
//		car.setColor("회색");
//		car.setMaxSpeed(200);
//		car.setprice(38000000);
		
		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.println("최대속도 : " + car3.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d원", car3.getPrice()));
		System.out.println();
		
	}

}
