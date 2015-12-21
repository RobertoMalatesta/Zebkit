package org.zebkit.client.ui.widgets;

public abstract class Widget {

	public static int global_id = 1;
	
	private String id;

	/**
	 * Constructor
	 * 
	 */
	public Widget() {
		this.id = Integer.valueOf(global_id++).toString();
	}
	
	
	public String getId() {
		return id;
	}
	
}
