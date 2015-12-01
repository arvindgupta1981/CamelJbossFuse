package arv.rd.ch02;

import org.apache.camel.builder.RouteBuilder;

import arv.rd.contextcomponent.CamelContext;

public class FileToJmsExample {
	public static void main(String[] args) throws Exception {
		CamelContext.getInstance().addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:data/inbox?noop=true")
				.to("jms:incomingOrders")
				.multicast()
				.parallelProcessing()
				.to("jms:accountingOrders", "jms:productionOrders") ;
			}
		});
		
		CamelContext.getInstance().start();
		Thread.sleep(10000);
		CamelContext.getInstance().stop();
	}
}
