# francisoud-sandbox
Automatically exported from code.google.com/p/francisoud-sandbox

**Various _'sandbox'_ projects**

## frontal-jms ##

CXF webservice.
Take a soap message and send it to a JMS Queue.

## ehcache ##

Testing ehcache in a simple Main program with a very basic cache config

## introspection ##

Test how much overhead java introspection introduce in code:

```
com.blogspot.francisoud.instrospection.MyBean@addbf1
    [id=12345,firstName=john,lastName=doe,address=123 street name,phone=+33123456789]
com.blogspot.francisoud.instrospection.MyBean@addbf1
    [id=12345,firstName=john,lastName=doe,address=123 street name,phone=+33123456789]
elapsed manual: 16
elapsed apache: 94
diff: 78ms
```

## ivy-template ##

Simple empty project with everything you need to bootstrap an ivy project.

## radant ##

Rapid Application Development for Apache Ant.

A set of already configured ant script you can use and import in a new project.

Avoir re-inventing the wheel everytime.

## sl4j-test ##

Simple project to use sl4j + logback (or sl4j-simple) impl instead of lo4j.

## webapp-aop ##

Simple webapp using spring and aop to log method durations
