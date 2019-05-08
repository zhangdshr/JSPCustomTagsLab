package net.mumde.cs545;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Head extends SimpleTagSupport {

	String theColor;

	String words;

	// This is called from JSP servlet to render custom tag
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		if (theColor != null)
			out.write(String.format("<span style='color:%s'>%s</span>", theColor, words));
		else
			out.write(String.format("<span>%s</span>", words));
	}

	// Need a setter for each attribute of custom tag
	public void setForeColor(String theColor) {
		this.theColor = theColor;
	}

	public void setText(String words) {
		this.words = words;
	}

}
