package org.zebkit.client.ui.widgets;

import org.zebkit.client.ui.layouts.Layout;

public class Canvas extends Widget {

	public Canvas() {
		super();
		createCanvas(getId());
	}
	
	public void add(Layout layout){
		relate(getId(), layout.getId());
	}
	
	public void add(Widget widget){
		relate(getId(), widget.getId());
	}
	
	private native void relate(String pid, String id) /*-{
		$wnd.root[pid].add($wnd.root[id]);
	}-*/;
	
	private native void createCanvas(String id) /*-{
	if ($wnd.root == null) {
		$wnd.eval($wnd.zebra.Import("ui", "layout"));
		$wnd.tc = new $wnd.zebra.ui.zCanvas(400,400);
		$wnd.root = $wnd.tc.root;
		$wnd.root[id] = $wnd.root;
		$wnd.root[id].setLayout(new $wnd.zebra.layout.ListLayout($wnd.zebra.layout.CENTER,2));
	}}-*/;
	
}
