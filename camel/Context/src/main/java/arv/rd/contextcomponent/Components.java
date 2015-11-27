package arv.rd.contextcomponent;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.Component;

public class Components {
	public static void addActiveMqComponent() {
		Component activemq = ActiveMQComponent.activeMQComponent("vm://localhost?broker.persistent=false");
		
		CamelContext.getInstance().addComponent("activemq", activemq);
	}
}
