/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;

/**
 * <pre>
 * org.dimigo.collection
 * 	 |_ MelonChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 25.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Music> list = new ArrayList<Music>();

		list.add(new Music("바람이나 좀 쐐","개리"));
		list.add(new Music("보통연애","박경"));
		list.add(new Music("취향저격","iKON"));
		
		System.out.println("-------<<멜론 챠트>>-------");
		printList(list);
		
		System.out.println("--------<<2위곡 추가>>--------");
		list.add(1, new Music("레옹","이유갓지"));
		printList(list);
		
		System.out.println("-------<<3위곡 변경>>--------");
		list.set(2, new Music("맙소사","황태지"));
		printList(list);
		
		System.out.println("---------<<4위 곡 삭제>>----------");
		list.remove(3);
		printList(list);

	}
	
	public static void printList(ArrayList<Music> list) {
		for(Music value : list) {
			System.out.println(value.toString());
		}
	}
}
