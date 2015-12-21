package org.zebkit.client.ui.layouts;

import org.zebkit.client.ui.widgets.Widget;

public class Gridlayout extends Layout{

	public Gridlayout(int rows, int cols) {
		super();
		createLayout(getId(), rows, cols);
	}
	
	private native void createLayout(String id, int rows, int cols) /*-{
		$wnd.root[id] = new $wnd.zebra.layout.GridLayout(rows, cols);
	}-*/;
}

