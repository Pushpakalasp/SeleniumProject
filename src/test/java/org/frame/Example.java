package org.frame;

public class Example extends LibGlobal{
	
	public static void main (String[] args) throws InterruptedException{
		
		openchrome();
		launchUrl("https://www.facebook.com/");
		closeBrowser();
		
	}

}
