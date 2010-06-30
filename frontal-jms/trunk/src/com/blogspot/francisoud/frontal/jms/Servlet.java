package com.blogspot.francisoud.frontal.jms;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

public class Servlet extends CXFNonSpringServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void loadBus(ServletConfig servletConfig) throws ServletException {
		super.loadBus(servletConfig);

		// You could add the endpoint publish codes here
		final Bus bus = getBus();
		BusFactory.setDefaultBus(bus);
		Endpoint.publish("/myservice", new ServiceImpl());
	}
}
