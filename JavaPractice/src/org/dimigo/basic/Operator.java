package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		double sadari = (a+b)*h1/2, punghang = a*h2;
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이:" +  sadari);
		System.out.println("평행사변형 넓이:" + punghang);
		System.out.println("사다리꼴이 평행사변형 보다 " + (sadari-punghang) + " 더 큽니다.");

	}

}
