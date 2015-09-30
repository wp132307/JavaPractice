/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 * 	 |_ Music
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 25.
 * </pre>
 * 
 * @author		:SAMSUNG
 * @version		:1.0
 */
public class Music {

	private String title;
	private String singer;
	/**
	 * @param title
	 * @param singer
	 */
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setSinger(String singer) {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
}
