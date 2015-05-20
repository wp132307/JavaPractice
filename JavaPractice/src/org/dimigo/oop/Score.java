/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class Score {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력=>");
		int kor = scanner.nextInt();
		
		System.out.print("수학 점수 입력=>");
		int mat = scanner.nextInt();
		
		System.out.print("영어 점수 입력=>");
		int eng = scanner.nextInt();
		
		int sum = kor+mat+eng;
		double avg = sum/3.0;
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("국어 점수 : ");
		sb.append(kor);
		sb.append("점\n");
		sb.append("수학 점수: ");
		sb.append(mat);
		sb.append("점\n");
		sb.append("영어 점수: ");
		sb.append(eng);
		sb.append("점\n");
		sb.append("총점 : ");
		sb.append(sum);
		sb.append("점\n");
		sb.append("평균 : ");
		sb.append(String.format("%.1f점", avg));
		
		System.out.println(sb.toString());
		scanner.close();
	}

}
