/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.blogspot.francisoud.frontal.jms;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public final class Client {

	private static final String NAMESPACE = "http://jms.frontal.francisoud.blogspot.com/";
	private static final QName SERVICE_NAME = new QName(NAMESPACE, "Myservice");
	private static final QName PORT_NAME = new QName(NAMESPACE, "MyservicePort");

	public static void main(String args[]) throws Exception {
		final String endpointAddress = "http://localhost:9000/frontal-jms/services/myservice";
		final URL wsdl = new URL(endpointAddress + "?wsdl");
		final Service service = Service.create(wsdl, SERVICE_NAME);
		service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING,
				endpointAddress);

		final com.blogspot.francisoud.frontal.jms.Service client = service
				.getPort(com.blogspot.francisoud.frontal.jms.Service.class);
		System.out.println("Client: before WS call...");
		client.sendToMyService("<root>TODO</root>");
		System.out.println("Client: WS call done!");
	}

}
