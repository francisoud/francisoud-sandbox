You can change implementation by removing: lib/impl/logback/*.jar from build path and replace with lib/impl/simple/*.jar

Using logback impl:
logback will use logback-test.xml if none logback.xml
rename logback-test.xml to logback-test.xml.bak to see own logback.xml work

logback-test.xml/logback.xml are convinient to differentiate debug logs from production logs.
logback-test.xml = for developpers
logback.xml = the file you will ship in your production delivery (you have to make sure you don't ship logback-test.xml)