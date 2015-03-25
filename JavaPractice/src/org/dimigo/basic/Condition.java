package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String car = "고속버스";
		int d = 10;
		int c;

		switch(car)
		{
		case "고속버스" : 
			c = 850; break;
		case "경차" : 
			c = 300; break;
		default : 
			c = 600; break;
		}
		
		if(c == 850){
			if(d%10!=0)
			c += d/10 * 300;
		}
		
		else{
			if(d%10!=0)
			c += d/10 * 200;
		}
			
		
		System.out.println("<<고속도로 통행료 계산 >>");
		System.out.println("거리 : " + d + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + c + "원");
			
	}

}
