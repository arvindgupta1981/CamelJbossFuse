package arv.rd.contextcomponent;

public class Initialize {
	
	public static void main(String[] args) {
		start();
	}
	
	protected static void start() {
		try {
			CamelContext.getInstance().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
