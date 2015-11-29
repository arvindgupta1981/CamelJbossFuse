package arv.rd.contextcomponent;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.Component;
import org.apache.camel.component.jms.JmsComponent;

public class Components {
	private static final String BROKER_URL = "vm://localhost?broker.persistent=false";
	
	public static void addActiveMqComponent() {
		//Component activemq = ActiveMQComponent.activeMQComponent("vm://localhost?broker.persistent=false");
		ConnectionFactory connectionFactoryActiveMq = new ActiveMQConnectionFactory(BROKER_URL);
		Component jmsComponents = JmsComponent.jmsComponentAutoAcknowledge(connectionFactoryActiveMq);
		CamelContext.getInstance().addComponent("jms", jmsComponents);
	}
}
