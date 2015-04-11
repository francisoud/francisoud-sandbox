package com.github.francisoud.sandbox.spring.properties.reloader;

import org.apache.commons.configuration.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"my-example.xml"}); // spring.xml
        BeanFactory factory = (BeanFactory) context;
//		Resource resource = new ClassPathResource("spring.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		// Configuration config = (Configuration) factory.getBean("configuration");
		while (true) {
			 // System.out.println(config.getString("key1"));
			System.out.println(((Model) factory.getBean("model")).getFoo());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
