package com.omkbron.examplelog4j;

import org.apache.log4j.Logger;

public class ExampleLog4j {

	private static Logger logger = Logger.getLogger(ExampleLog4j.class);
	
	public static void main(String[] args) {
		logger.trace("Mensaje de nivel TRACE");
		logger.debug("Mensaje de nivel DEBUG");
		if(logger.isDebugEnabled())logger.debug(getMessage());
		logger.info("Mensaje de nivel INFO");
		logger.warn("Mensaje de nivel WARN");
		logger.error("Mensaje de nivel ERROR");
		logger.fatal("Mensaje de nivel FATAL");
	}

	private static String getMessage() {
		logger.fatal("Holaaaaa");
		return "Mensaje a traves de un metodo";
	}

}
