package arv.rd.ch01;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;

public class FileCopierWithCamel {
	
	public static void main(String[] args) throws Exception {
		CamelContext camelContext = arv.rd.contextcomponent.CamelContext.getInstance();
		camelContext.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("file:data/inbox?noop=true")
				.to("file:data/outbox");
			}
		});
		camelContext.start();
		Thread.sleep(10000);
		camelContext.stop();
	}
}
