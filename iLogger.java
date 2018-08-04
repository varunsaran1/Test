public interface iLogger {

	
	void setLogLevel(LogLevel logLevel) ;
	 void info(String message) ;
	 void error(String message) ;
	 void error(String message,Throwable t) ;
	 void debug(String message) ;
	

}