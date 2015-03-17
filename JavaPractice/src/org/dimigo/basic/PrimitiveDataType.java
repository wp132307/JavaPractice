package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		string name = "아이유";
		boolean gender = true;
		int age = 23;
		double heigh= 161.8;
		float weigh= 44.3;
		char bloodType='A';
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : %s", name);
		System.out.println("성별 : ");
		if(gender) {
			System.out.println("여자");
		}
		else {
			System.out.println("남자");
		}
		System.out.println("나이 : %d세", age);
		System.out.println("키 : %.1lf",);
	}

}
