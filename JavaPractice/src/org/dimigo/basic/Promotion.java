package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int mMoney = 1700000;
		int clerk = 3;
		int store = 1500; 
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d원",mMoney));
		System.out.println("점포 내 직원수 : " + String.format("%,d명",clerk));
		System.out.println("점포 수 : " + String.format("%,d개",store));
		System.out.println("연간 인건비 : " + String.format("%,d원", (long)mMoney * 12 * clerk * store));

	}

}
