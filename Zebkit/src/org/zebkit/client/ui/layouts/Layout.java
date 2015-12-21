package org.zebkit.client.ui.layouts;

public abstract class Layout {

	public static int global_id = -1;
	
	private String id;

	/**
	 * Constructor
	 * 
	 * @param id
	 */
	public Layout() {
		this.id = Integer.valueOf(global_id--).toString();
	}
	
	
	public String getId() {
		return id;
	}
	
}
