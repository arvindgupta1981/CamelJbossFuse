package arv.rd.contextcomponent;

import org.apache.camel.impl.DefaultCamelContext;

public class CamelContext {
	private static final org.apache.camel.CamelContext CONTEXT = new DefaultCamelContext();
	
	public static org.apache.camel.CamelContext getInstance() {
		return CONTEXT;
	}

}
