package org.zebkit.client.ui.layouts;

public class BorderPan extends Layout {

	Constraints constraints;
	
	public BorderPan(String tekst, Layout layout) {
		super();
		createpanel(getId(), tekst, layout.getId());
	}
	
	private native void createpanel(String id, String tekst, String pid) /*-{
		$wnd.root[pid].setPadding(4);
		$wnd.root[id] = new $wnd.zebra.ui.BorderPan(tekst, $wnd.root[pid]);
		$wnd.root[id].setPreferredSize(-1, -1);
	}-*/;
	
}

