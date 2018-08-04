class Logger implements iLogger{
	
	private LogLevel logLevel ;
	private List<LogOutput> outputs ;
	private String name ;
	private Logger() {
		
		
	}

	public static Logger getLogger(String name, LogLevel logLevel, List<LogOutput> outputs) {
		this.name = name ;
		this.logLevel = logLevel ;
		this.outputs =outputs ;
	}	
		
	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel ;
	};
	
	public void info(String message) {
		 if(logLevel.value() >LogLevel.INFO.value() ) {
			 outputs.forEach(output -> output.append(name + ":" +message)) ;
		 }
	 };
	 
	public  void error(String message) {
		 
	 };
	
	public	void error(String message,Throwable t) {
		 
	 };
	
	public 	void debug(String message) {
		 
		 
	 };
	
	
	
}