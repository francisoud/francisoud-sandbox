To test the difference:
  - you need to always have lib/log4j-1.2.15.jar in your classpath
  - first run the Main using lib/jcl/commons-logging-1.1.jar 
  		=> run Main 
  			=> logs using jcl+log4j
  - remove commons-logging-1.1.jar and add slf4j/*.jar in your classpath 
  		=> run Main 
  			=> logs using slf4j+log4j (no code modification)