package com.truongha;

import org.apache.log4j.Logger;

public class HelloWorld {
	
	static final Logger logger = Logger.getLogger(HelloWorld.class);
	
	public void sayHi(){
		logger.info("Hello");
	}
	
}
