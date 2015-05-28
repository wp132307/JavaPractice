/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Idol
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 27.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","소진","민아","혜리","그외"}
		};

		for(int i=0; i<idolGroup.length; i++) {
			System.out.println("<<"+idolGroup[i]+">>");
			for(int j=0; j<members.length; j++) {
				for(int k=0; k<members[j].length; k++)
					System.out.println(members[j][k]);
				System.out.println();
			}
			
		}
	}

}
