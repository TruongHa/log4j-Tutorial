package com.truongha;

import org.apache.log4j.xml.DOMConfigurator;

public class log4jTutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		DOMConfigurator.configure("log4j.xml");
		HelloWorld hw = new HelloWorld();
		hw.sayHi();
	}
}
