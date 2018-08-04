class LoggerFactory {
	
	private LogLevel defaultLogLevel = LogLevel.Info ;
	private String defaultConfigFilePath = "default.xml" ;
	
	class ConsoleOutput implements LogOutput {
		@Override
		void appendOutput(String message) {
			
		}
	}	
	
	class FileOutput implements LogOutput {
		@Override
		void appendOutput(String message) {
			
		}
	}
	
	public static Logger getLogger(String name) {
		return getLogger(name, defaultLogLevel, defaultConfigFilePath) ;
		
	}	
	
	public static Logger getLogger(String name, LogLevel level , String configFilePath) {
		return Logger.getLogger(String name, LogLevel logLevel, createLogOutput(configFilePath)) ;
	}
	
	private List<LogOutput> createLogOutput(String configFilePath) {
		List<LogOutput> outputs = new ArrayList<>() ;
		
		//Parse xml file and create LogOutput
		
		
		return outputs ;
		
	}	
	
}	
