/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	 |_ AgeCheckException
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class AgeCheckException extends Exception {

	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.title + "은/는 15세 이상 이용 관람가입니다.");
	}
}
