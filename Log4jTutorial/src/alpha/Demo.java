package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugginh");
		if(5>4);
		log.info("object is present");
		log.error("This is error");
		log.fatal("This is fatal error.");
	}

}
