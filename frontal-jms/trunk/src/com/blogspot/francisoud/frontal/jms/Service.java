package com.blogspot.francisoud.frontal.jms;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Service {
	public void sendToMyService(@WebParam(name = "demand")
	final String demand);
}
