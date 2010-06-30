package com.blogspot.francisoud.frontal.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jws.WebService;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@WebService(endpointInterface = "com.blogspot.francisoud.frontal.jms.Service", serviceName = "Myservice")
public class ServiceImpl implements Service {

	private final Context ctx;
	private final ConnectionFactory factory;
	private final Connection connection;
	private final Session session;
	private final Destination destination;
	private final MessageProducer producer;

	public ServiceImpl() {
		try {
			ctx = new InitialContext();
			factory = (ConnectionFactory) ctx
					.lookup("jms/projectConnectionFactory");
			connection = factory.createConnection();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			destination = (Queue) ctx.lookup("jms/projectQueue");
			producer = session.createProducer(destination);
		} catch (NamingException e) {
			throw new RuntimeException(e);
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}

	public void sendToMyService(final String demand) {
		System.out.println("- - - - - - - - - - -");
		System.out.println("Calling sendToMyService()...");
		System.out.println("- - - - - - - - - - -");

		final Demand dmd = new Demand(demand);
		try {
			final TextMessage message = createMessage(dmd, session);
			producer.send(message);
		} catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}

	private TextMessage createMessage(final Demand dmd, final Session session)
			throws JMSException {
		final TextMessage message = session.createTextMessage();
		message.setStringProperty("CodeInsee", dmd.getCodeInsee());
		message.setStringProperty("Domain", dmd.getDomain());
		message.setStringProperty("Origin", dmd.getOrigin());
		message.setStringProperty("Ui", dmd.getUi());
		message.setText(dmd.getDemand());
		return message;
	}
}
