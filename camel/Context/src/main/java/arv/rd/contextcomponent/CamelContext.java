package arv.rd.contextcomponent;

import org.apache.camel.impl.DefaultCamelContext;

public class CamelContext {
	private static final org.apache.camel.CamelContext CONTEXT = new DefaultCamelContext();
	private static void start() {
		try {
			CONTEXT.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		start();
	}

}
