package org.zebkit.client.ui.layouts;

public class Constraints extends Layout {

	public Constraints() {
		super();
		createConstraint(getId());
	}
	
	public void setOrientation(){
		setOrientation(getId());
	}
	
	public void setPadding(int padding) {
		setPadding(getId(), padding);
	}
	
	private native void setPadding(String id, int padding) /*-{
		$wnd.root[id].setPadding(2);
	}-*/;

	
	private native void setOrientation(String id) /*-{
		$wnd.root[id].ay = $wnd.zebra.layout.CENTER;
	}-*/;
	
	private native void createConstraint(String id) /*-{
		$wnd.root[id] = new $wnd.zebra.layout.Constraints();
	}-*/;
	
}
