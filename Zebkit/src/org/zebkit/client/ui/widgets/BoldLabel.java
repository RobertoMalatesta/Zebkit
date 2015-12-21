package org.zebkit.client.ui.widgets;

public class BoldLabel extends Widget {

	public BoldLabel(String text) {
		super();
		createLabel(getId(), text);
	}
	
	private native void createLabel(String id, String text) /*-{
		$wnd.root[id] = new $wnd.zebra.ui.BoldLabel(text);
	}-*/;
	
	public final native void setText(String id, String text) /*-{
		$wnd.root[id].setValue(text);
	}-*/;
}
