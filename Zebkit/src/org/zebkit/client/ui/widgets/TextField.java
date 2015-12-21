package org.zebkit.client.ui.widgets;

import org.zebkit.client.ui.ChangeHandler;

public class TextField extends Widget {
	private String text = "";
	private int len = 10;
	
	public TextField() {
		super();
		
		this.createTextField(getId());
	}
	
	public TextField(String tekst) {
		super();
		this.text = tekst;
		
		this.createTextField(getId(), text, len);
	}
	
	public TextField(String tekst, int len) {
		super();
		this.text = tekst;
		this.len = len;
		
		this.createTextField(getId(), text, len);
	}
	
	public void setPreferredSize(int pos, int kolom) {
		setPreferredSize(getId(), pos, kolom);
	}
	
	public void addListener(ChangeHandler ch) {
		this.addListener(getId(), ch);
	}
	
	public void setText(String text) {
		this.setText(getId(), text);
	}
	
	public void setHint(String text) {
		setHint(getId(), text);
	}
	
	private native void setHint(String id, String text) /*-{
		$wnd.root[id].setHint(text);
	}-*/;
	
	private native void createTextField(String id) /*-{
		$wnd.root[id] = new $wnd.zebra.ui.TextField('');
	}-*/;
	
	private native void createTextField(String id, String text, int len) /*-{
		$wnd.root[id] = new $wnd.zebra.ui.TextField(text, len);
	}-*/;
	
	private native void setText(String id, String text) /*-{
		$wnd.root[id].setValue(text);
	}-*/;
	
	private native void addListener(String id, ChangeHandler ch) /*-{
		$wnd.root[id].focusLost = function(e) { 
			ch.@org.zebkit.client.ui.ChangeHandler::onChange()();
		}; 
	}-*/;
	
	private native void setPreferredSize(String id, int pos, int kolom) /*-{
		$wnd.root[id].setPreferredSize(pos, kolom);
	}-*/;
	
	
}
