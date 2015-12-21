package com.mycompany.mywebapp.client;

import org.zebkit.client.ui.ChangeHandler;
import org.zebkit.client.ui.layouts.BorderPan;
import org.zebkit.client.ui.layouts.Constraints;
import org.zebkit.client.ui.layouts.Gridlayout;
import org.zebkit.client.ui.layouts.Panel;
import org.zebkit.client.ui.widgets.BoldLabel;
import org.zebkit.client.ui.widgets.Canvas;
import org.zebkit.client.ui.widgets.TextField;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyWebApp implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
	  
		Canvas canvasWidget = new Canvas();
		
		Panel panel = new Panel();
		Gridlayout gridLayout = new Gridlayout(3, 2);
		panel.setLayout(gridLayout);

		Constraints constraints = new Constraints();
		constraints.setOrientation();
		constraints.setPadding(2);
		panel.setConstraints(constraints);
		
		TextField tf = new TextField();
		tf.setPreferredSize(150,  -1);
		tf.setHint("<name>");
		
//		tf.addListener(new ChangeHandler() {
//			
//			@Override
//			public void onChange() {
//				
//				alert();
//			}
//		});
		
		BoldLabel boldlabel = new BoldLabel("Name:");
		
		panel.add(boldlabel);
		panel.add(tf);
		
		final TextField tf2 = new TextField();
		tf2.setPreferredSize(150,  -1);
		tf2.setHint("<address>");
		
		BoldLabel boldlabel2 = new BoldLabel("Address:");
		
		panel.add(boldlabel2);
		panel.add(tf2);
		
		BorderPan bp = new BorderPan("Name and Address", panel);
		
		canvasWidget.add(bp);
	}

	
	private native void alert() /*-{
		alert('change');
	}-*/;
	  
}
