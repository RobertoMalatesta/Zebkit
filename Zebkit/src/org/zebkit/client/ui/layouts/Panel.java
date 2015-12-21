package org.zebkit.client.ui.layouts;

import org.zebkit.client.ui.widgets.Widget;

public class Panel extends Layout {

	Constraints constraints;
	
	public Panel() {
		super();
		createpanel(getId());
	}
	
	public void setLayout(Layout layout) {
		setLayout(this.getId(), layout.getId());
	}
	
	public void setConstraints(Constraints constraints) {
		this.constraints = constraints;
	}
	
	public void add(Widget widget) {
		add(getId(), constraints.getId(), widget.getId());
	}
	
	private native void add(String pid, String constrid, String id) /*-{
		$wnd.root[pid].add($wnd.root[constrid], $wnd.root[id]);
	}-*/;
	
	private native void setLayout(String pid, String id) /*-{
		$wnd.root[pid].setLayout($wnd.root[id]);
	}-*/;
	
	private native void createpanel(String id) /*-{
		$wnd.root[id] = new $wnd.zebra.ui.Panel();
	}-*/;
	
}

