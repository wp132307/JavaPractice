/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class Question {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("가장 좋아하는 히어로는?");
		String answer1 = scanner.nextLine();
		if(answer1 != null && answer1.equals("스파이더맨")) {
			System.out.println("정답입니다!!");
		}
		else
			System.out.println("틀렸습니다!!");
		
		
		System.out.println("내가 다니는 학교는?");
		String answer2 = scanner.nextLine();
		if(answer2 != null && answer2.equals("디미고")) {
			System.out.println("정답입니다!!");
		}
		else
			System.out.println("틀렸습니다!!");
		
		System.out.println("나의 이름은?");
		String answer3 = scanner.nextLine();
		if(answer3 != null && answer3.equals("김수정")) {
			System.out.println("정답입니다!!");
		}
		else
			System.out.println("틀렸습니다!!");

	}

}
