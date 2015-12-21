Zebkit - Meets JAVA
==============================================

![Zebkit](Gallery/Zebkit and GWT.png)


## Main purpose of the project:

To define a nice user interface with a minimum of knowledge of javascript, html5 and styling....

HOW?

by using JAVA!!

The screenprint is created by the following JAVA code:


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

		
and the following programs in the background:
		
- the HTML-5 canvas 
- the zebkit javascript library (www.zebkit.org)
- GWT (Google Web Toolkit)


