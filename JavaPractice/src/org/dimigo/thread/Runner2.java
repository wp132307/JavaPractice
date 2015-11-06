/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	 |_ Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class Runner2 implements Runnable {

	private String name;

	
	public Runner2() {
		
	}
	
	public Runner2(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		
		int time = 1000;
		int d = 100;
		
		System.out.println(name + "출발");
		
		for(int i=0; i<11; i++) {
			System.out.println(name + (d - i*10) + "미터");
			try {
				Thread.sleep(time);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println(name + "골인");
		
	}
}
