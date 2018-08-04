class MainApplication {
	
		private static Logger logger = LoggerFactory.get(MainApplication.class.getName()) ;
		private static Logger logger1 = LoggerFactory.get(MainApplication.class.getName(),LogLevel.DEBUG, "/myLogger.xml") ;
		public static void main (String[] args) {
			
			logger.info("hello world") ;
			logger1.debug("hello again" ) ;
		}	
	
	
	
}	