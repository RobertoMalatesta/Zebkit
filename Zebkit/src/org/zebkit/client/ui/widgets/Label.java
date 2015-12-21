package org.zebkit.client.ui.widgets;

public class Label extends Widget {

	public Label(String text) {
		super();
		createLabel(getId(), text);
	}
	
	private native void createLabel(String id, String text) /*-{
		$wnd.root[id] = new $wnd.zebra.ui.Label(text);
	}-*/;
	
	public final native void setText(String id, String text) /*-{
		$wnd.root[id].setValue(text);
	}-*/;
}
